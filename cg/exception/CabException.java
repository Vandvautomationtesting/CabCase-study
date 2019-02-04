package com.cg.exception;

public class CabException extends Exception {
		private static final long serialVersionUID = 1L;
		public CabException()
		{
			super();
		}
		public CabException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
		{
			super(message, cause, enableSuppression, writableStackTrace);
		}
		public CabException(String message, Throwable cause) 
		{
			super(message, cause);
		}
		public CabException(String message) 
		{
			super(message);			
		}
		public CabException(Throwable cause) 
		{
			super(cause);			
		}

}
