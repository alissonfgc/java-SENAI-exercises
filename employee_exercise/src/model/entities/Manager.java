package model.entities;

public class Manager extends Employee {

	private Integer password;
	private Integer numberOfEmployeesManaged;

	public Manager(String name, String cpf, Double salary, Integer password, Integer numberOfEmployeesManaged) {
		super(name, cpf, salary);
		this.password = password;
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public Integer getNumberOfEmployeesManaged() {
		return numberOfEmployeesManaged;
	}

	public void setNumberOfEmployeesManaged(Integer numberOfEmployeesManaged) {
		this.numberOfEmployeesManaged = numberOfEmployeesManaged;
	}

	public boolean authentic(int password) {
		if (this.password == password) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	@Override
	public double getBonus() {
		return super.salary * 0.15 + 1000.00;
	}

}
