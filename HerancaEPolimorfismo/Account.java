package HerancaEPolimorfismo;

public class Account {
	private String holder;
	private Integer number;
	private Double balance;

	public Account() {
		
	}
	
	public Account(String holder, Integer number, Double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}
	
	public void withDraw(Double amout) {
		
	}

	public void deposit(Double amout) {
		
	}
	
	public String getHolder() {
		return holder;
	}
	
}
