package tema19;


public class Employee extends Person {
	private String office;
	private double salary;

	public Employee(String name, String address, String phoneNumber, String email, String office, double salary) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + "\n" + "Office: " + office + "\n" + "Salary: " + salary + "\n";
	}

}
