package streamApi;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private String department;
	public Employee(String name, int age, double salary, String department) {
		setName(name);
		setAge(age);
		setSalary(salary);
		setDepartment(department);
		
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
