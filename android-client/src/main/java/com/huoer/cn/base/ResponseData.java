package com.huoer.cn.base;

import java.io.Serializable;

import com.huoer.cn.utils.DateConvertUtils;

public class ResponseData implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8620306114746397132L;
	private String timestamp;
	private String status;
	private String error;
	private String exception;
	private String message;
	private String path;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	
	

}
