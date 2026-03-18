package ExceptionsHandling;

public class InsufficientFundException extends RuntimeException {
	
	public InsufficientFundException() {
		super("Insufficient fund transfer");
	}

}
