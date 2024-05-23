package model.entities;

public class Employee {
	protected String name;
	protected String cpf;
	protected Double salary;

	public Employee(String name, String cpf, Double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return this.salary * 0.10;
	}

}
