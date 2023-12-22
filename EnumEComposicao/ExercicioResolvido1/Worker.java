package EnumEComposicao.ExercicioResolvido1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkedLevel level;
	private Double baseSalary;
	private List<HourContract> contracts = new ArrayList<>();
	private Department departament;

	Worker() {
	}

	public Worker(String name, WorkedLevel level, Double baseSalary, Department departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkedLevel getLevel() {
		return level;
	}

	public void setLevel(WorkedLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}
	
	public String getDepartamentName() {
		return departament.getName();
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(int year, int mouth) {
		Double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract contract: contracts) {
			cal.setTime(contract.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_mouth = cal.get(Calendar.MONTH) + 1;
			
			if(year == c_year && c_mouth == mouth) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}
}
