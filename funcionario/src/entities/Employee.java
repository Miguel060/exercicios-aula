package entities;

public class Employee {
	public String name;
	public double gross_salary;
	public double tax;
	public double netSalary() {
		return this.gross_salary - tax;
	}
	public void increaseSalary(double percentage) {
		gross_salary += gross_salary * (percentage / 100.0);
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}

}
