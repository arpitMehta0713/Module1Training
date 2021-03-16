package streamApi;
import streamApi.*;
import java.util.function.*;
import java.util.*;
import java.util.stream.*;
public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeMain project = new EmployeeMain();
		project.run();
	}
	public void run() {
		Employee employee1=new Employee("Arpit",52,30000,"Developer");
		Employee employee2=new Employee("Abhishek", 41, 35000, "Developer");
		Employee employee3=new Employee("Rohit",50,40000,"Testing");
		Employee employee4=new Employee("Shivendra", 53, 45000,"Testing");
		List<Employee> employees= new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		Optional<Double> optional=employees.stream().filter((employee)->employee.getAge()>50).map((employee)->employee.getSalary()).reduce((emp1,emp2)->emp1+emp2);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		
		Optional<Employee> optional1=employees.stream().max((e1,e2)->e1.getAge()-e2.getAge());
		if(optional1.isPresent()) {
			Employee employee=optional1.get();
			System.out.println(employee.getName()+","+employee.getAge()+","+employee.getDepartment()+","+employee.getSalary());
		}
		
		
		employees.stream().filter((employee)->employee.getAge()>30).sorted((e1,e2)->e1.getAge()-e2.getAge()).forEach((employee)->System.out.println(employee.getName()+","+employee.getAge()+","+employee.getDepartment()+","+employee.getSalary()));
		
		employees.stream().filter((employee)->employee.getAge()>30).sorted((e1,e2)->e2.getAge()-e1.getAge()).forEach((employee)->System.out.println(employee.getName()+","+employee.getAge()+","+employee.getDepartment()+","+employee.getSalary()));
		
		
	}
}
