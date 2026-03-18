package ExceptionsHandling;

public class TestAccount {

	public static void main(String[] args) {
	
		Account a = new Account();
		
		a.setBalance(10000.00);
		
		System.out.println("Balance is: " + a.getBalance());
		
		a.withdrawal(1000);
		a.withdrawal(10000.00);
		
	}

}
