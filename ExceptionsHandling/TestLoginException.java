package ExceptionsHandling;

public class TestLoginException {

	public static void main(String[] args) {
		
		String user = "admin1234";
		
		if(user == "admin")
			System.out.println("user admin");
		else 
			throw new LoginException();
		
		System.out.println("Login Successful");

	}

}
