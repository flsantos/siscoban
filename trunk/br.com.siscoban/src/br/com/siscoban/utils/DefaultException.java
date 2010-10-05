package br.com.siscoban.utils;

public class DefaultException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	public DefaultException(String msg){
		this.msg = msg;
	}
}
