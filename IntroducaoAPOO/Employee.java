package IntroducaoAPOO;

import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	String email;
	double grossSalary;
	double tax;

	public Employee() {
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.grossSalary = salary;
	}

	public Employee(String name, String email, double salary) {
		this.name = name;
		this.email = email;
		this.grossSalary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public double getSalary() {
		return grossSalary;
	}

	double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary *= 1.0 + (percentage / 100);
	}

	public String apresentar() {
		return String.format("%d, %s, %.2f", id, name, grossSalary);
	}

	public static int indexOfIDInList(int id, List<Employee> employees) {
		return employees.indexOf(new Employee(id, null, 0));
	}

	@Override
	public String toString() {
		return String.format("%s, $ %.2f", name, netSalary());
	}

	@Override
	public int compareTo(Employee employee) {
		return this.id - employee.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

}
