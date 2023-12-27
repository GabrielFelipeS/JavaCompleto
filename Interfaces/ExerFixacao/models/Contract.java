package Interfaces.ExerFixacao.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private int number;
	private LocalDate date;
	private double totalValue;

	private List<Installment> listInstallments = new ArrayList<>();

	public Contract(int number, LocalDate date, double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public LocalDate getDate() {
		return date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getListInstallments() {
		return listInstallments;
	}

	public void add(Installment installment) {
		listInstallments.add(installment);
	}

	public void printInstallments() {
		for (Installment installment : listInstallments) {
			System.out.println(installment);
		}
	}
}
