package ExceptionsHandling;

public class LoginException extends RuntimeException {
	
	public LoginException() {
		super("User not found");
	}

}
