package HerancaEPolimorfismo;

public class BusinessAccount extends Account{
	private double loadLimit;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(String holder, Integer number, Double balance, double loadLimit) {
		super(holder, number, balance);
		this.loadLimit = loadLimit;
		super.getHolder();
	}

	public void load(double amout) {
		if(amout <= loadLimit) {			
			deposit(amout);
		}
	}
}
