package IntroducaoAPOO;

public class Employee {
	String name;
	double grossSalary;
	double tax;
	
	double netSalary() {
		return grossSalary - tax;
	}
	
	void increaseSalary(double percentage) {
		grossSalary *=  1.0 + (percentage/100);
	}
	
	@Override
	public String toString() {
		return String.format("%s, $ %.2f", name, netSalary());
	}
}
