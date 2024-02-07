package ExceptionsERuntimeException.Fixacao.Model.Entity;

import ExceptionsERuntimeException.Fixacao.Model.Exception.AmountException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account(Integer number, String holder, Double deposit, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = deposit;
		this.withDrawLimit = withDrawLimit;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) {
		if(amount > withDrawLimit) {
			throw new AmountException("The amount exceeds the withdraw limit");
		}
		
		if(balance < amount) {
			throw new AmountException("Not enough balance");
		}
		
		balance -= amount;
	}
}
