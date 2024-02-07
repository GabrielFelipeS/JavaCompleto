package ExercicioDeFixacao;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount + 5) {
			balance -= (amount + 5);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f", number, holder, balance);
	}
	
}
