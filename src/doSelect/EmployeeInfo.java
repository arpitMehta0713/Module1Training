package doSelect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;
    public Employee(String name, int salary){
    setName(name);
    setSalary(salary);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {
        BYNAME,
        BYSALARY
    }
    public List<Employee> sort(List<Employee> emps, final SortMethod method){
        if(method==SortMethod.BYNAME){
            List<Employee> sortedByName=emps.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());
            return sortedByName;
        }
        else{
            List<Employee> sortedBySalary=emps.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary()).collect(Collectors.toList());
            return sortedBySalary;
        }
    }
    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character){
        long count = entities.stream().filter(e1->e1.getName().startsWith(character)).count();
        return count>0;
    }
    public static void main(String[]  args){
        Employee emp1=new Employee("Mickey",100000);
        Employee emp2=new Employee("Timmy",50000);
        Employee emp3=new Employee("Anny",40000);
        List<Employee>list=new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        EmployeeInfo info=new EmployeeInfo();
        List<Employee>sortedBySal=info.sort(list, EmployeeInfo.SortMethod.BYSALARY);
        sortedBySal.stream().forEach(emp->System.out.println(emp.getName()+":"+emp.getSalary()));
        List<Employee>sortedByName=info.sort(list, EmployeeInfo.SortMethod.BYNAME);
        sortedBySal.stream().forEach(emp->System.out.println(emp.getName()+":"+emp.getSalary()));
        System.out.println(sortedByName);
        System.out.println(sortedBySal);
        boolean startswith=info.isCharacterPresentInAllNames(list,"R");
        System.out.println(startswith);
    }
}