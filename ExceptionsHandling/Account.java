package ExceptionsHandling;

public class Account {

	private double balance;
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdrawal(double amount) {
		if(amount < balance) {
			balance = balance - amount;
			System.out.println("Withdrawal successful... Current balance is " + balance);
		}
		else
			throw new InsufficientFundException();
	}
	
}
