package Interfaces.ExerFixacao.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate dueDate;
	private double amount;

	public Installment(LocalDate dueDate, double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return String.format("%s - %.2f", dueDate.format(dtf), amount);
	}
}
