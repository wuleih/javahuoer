package com.huoer.cn.aspectj;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Aspect
@Component
public  class SystemLogAspect {
    //本地异常日志记录对象    
    private  static  final Logger logger = LoggerFactory.getLogger(SystemLogAspect. class);
     
    //Controller层切点
    @Pointcut("@annotation(com.huoer.cn.aspectj.ActionControllerLog)")
    public  void controllerAspect() {
    	System.err.println("~~~~~~~~~~~~~~~~~~~~~");
    }    
     
    /**  
     * 前置通知 用于拦截Controller层记录用户的操作 
     *
     * @param joinPoint 切点
     */
    @AfterReturning(pointcut="controllerAspect()")
    public  void doBefore(JoinPoint joinPoint) {
        handleLog(joinPoint,null);
    }
     
     
//    @AfterReturning(pointcut="controllerAspect()",argNames = "joinPoint,retVal",returning = "retVal")
    @AfterThrowing(value="controllerAspect()",throwing="e")
    public void doAfter(JoinPoint joinPoint,Exception e)
    {
        handleLog(joinPoint,e);
    }
 
private void handleLog(JoinPoint joinPoint,Exception e) {
    try {
        //获得注解
        ActionControllerLog controllerLog = giveController(joinPoint);
        if(controllerLog == null)
        {
            return;
        }
        //获取当前的用户
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String str = "数据库地方哈"; 
        //处理设置注解上的参数
        getControllerMethodDescription(controllerLog,str,request);
      }  catch (Exception exp) {
       //记录本地异常日志
       exp.printStackTrace();
      }
}
     
    /**  
     * 获取注解中对方法的描述信息 用于Controller层注解
     *  
     * @param
     * @return 方法描述
     * @throws Exception
     */   
     public  static void getControllerMethodDescription(ActionControllerLog controllerLog,String str,HttpServletRequest request)  throws Exception { 
        
    	StringBuffer sb = new StringBuffer(str);
        sb.append("~~~~~action------"+controllerLog.action());
        sb.append("~~~~~~~~~~chanel----------"+controllerLog.channel()+"~~~~~~~~~~title----------"+controllerLog.title());
        System.err.println(sb.toString());
        //是否需要保存request，参数和值
        if(controllerLog.isSaveRequestData())
        {
            //获取参数的信息，传入到数据库中。
            setRequestValue(sb.toString(),request);
        }
     }
 
     /**
      * 获取请求的参数，放到log中
      * @param userlogModel
      * @param request
      */
    @SuppressWarnings("rawtypes")
    private static void setRequestValue(String userlogModel,HttpServletRequest request) {
    }
     
    /**
     * 是否存在注解，如果存在就记录日志
     * @param joinPoint
     * @param
     * @return
     * @throws Exception
     */
    private static ActionControllerLog giveController(JoinPoint joinPoint) throws Exception
    {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();  
         
        if(method != null)
        {
            return method.getAnnotation(ActionControllerLog.class);
        }
        return null;
    }
}
