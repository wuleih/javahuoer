package com.timer.cn.base;

import com.timer.cn.utils.DateConvertUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author wulei
 * @date 2016年11月21日
 * @version 下午1:52:27
 */
public class BaseEntity implements Serializable{
	private static final long serialVersionUID = -5392149045475383492L;
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
			
	/** ID */
	private Long id;

	/** 创建日期 */
	private Date createTime;
	private Date createTimeBegin;
	private Date createTimeEnd;

	/** 修改日期 */
	private Date modifyTime;
	private Date modifyTimeBegin;
	private Date modifyTimeEnd;
	
	private boolean softDelete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public String getCreateTimeString() {
		return DateConvertUtils.format(getCreateTime(), DATE_TIME_FORMAT);
	}
	public void setCreateTimeString(String value) {
		setCreateTime(DateConvertUtils.parse(value, DATE_TIME_FORMAT));
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
	public boolean isSoftDelete() {
		return softDelete;
	}

	public void setSoftDelete(boolean softDelete) {
		this.softDelete = softDelete;
	}

	public Date getModifyTime() {
		return modifyTime;
	}
	
	public String getModifyTimeString() {
		return DateConvertUtils.format(getModifyTime(), DATE_TIME_FORMAT);
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	public void setModifyTimeString(String value) {
		setModifyTime(DateConvertUtils.parse(value, DATE_TIME_FORMAT));
	}
	
	public Date getCreateTimeBegin() {
		return createTimeBegin;
	}
	

	public void setCreateTimeBegin(Date createTimeBegin) {
		this.createTimeBegin = createTimeBegin;
	}

	public Date getCreateTimeEnd() {
		return createTimeEnd;
	}

	public void setCreateTimeEnd(Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public Date getModifyTimeBegin() {
		return modifyTimeBegin;
	}

	public void setModifyTimeBegin(Date modifyTimeBegin) {
		this.modifyTimeBegin = modifyTimeBegin;
	}

	public Date getModifyTimeEnd() {
		return modifyTimeEnd;
	}

	public void setModifyTimeEnd(Date modifyTimeEnd) {
		this.modifyTimeEnd = modifyTimeEnd;
	}

	/**
	 * 重写equals方法
	 * 
	 * @param obj
	 *            对象
	 * @return 是否相等
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!BaseEntity.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		BaseEntity other = (BaseEntity) obj;
		return getId() != null ? getId().equals(other.getId()) : false;
	}

	/**
	 * 重写hashCode方法
	 * 
	 * @return hashCode
	 */
	@Override
	public int hashCode() {
		int hashCode = 17;
		hashCode += null == getId() ? 0 : getId().hashCode() * 31;
		return hashCode;
	}

}
