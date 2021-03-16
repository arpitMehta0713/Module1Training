package streamApi;

public class EmployeeDto {
	private String name;
	private int age;
	private double salary;
	public EmployeeDto(String name, int age, double salary) {
		setName(name);
		setAge(age);
		setSalary(salary);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
