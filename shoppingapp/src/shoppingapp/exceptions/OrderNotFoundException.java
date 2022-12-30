package shoppingapp.exceptions;
//User defined or custom exceptions
public class OrderNotFoundException extends Exception{
	String message;

	public OrderNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public OrderNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public OrderNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OrderNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OrderNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
