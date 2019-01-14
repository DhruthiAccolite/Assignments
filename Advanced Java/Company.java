import java.util.Iterator;
import java.util.TreeSet;

class Company{
    private String name;
    private Address address;
    TreeSet<Employee> employee;

    public Company(String name,Address address){
        this.name=name;
        this.address=address;
        this.employee=new TreeSet<>((emp1,emp2) ->
        (emp1.getAge()<emp2.getAge() ?
            -1:(emp1.getAge()==emp2.getAge() ? 0:1)));
    }

    public TreeSet<Employee> getEmployeeSet() {
		return this.employee;
    }

    public Address getAddress(){
		return this.address;
    }

    public void addEmployee(Employee e){
        this.employee.add(e);
    }


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void getAllEmployees(){
        Iterator<Employee> emp=employee.iterator();
        while(emp.hasNext()){
            Employee e=emp.next();
            e.printAboutEmployee();
        }
    }


}