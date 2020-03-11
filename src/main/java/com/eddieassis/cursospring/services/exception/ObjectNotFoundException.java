package com.eddieassis.cursospring.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	/**
	 * Add o serialVerion quando extender da RuntimeException.
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
