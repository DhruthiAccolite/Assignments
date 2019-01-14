public class Employee {
	static String workHours = "9AM to 6PM";					
	int id;
	String name;
	String designation;

	public Employee(int id, String name,String designation){
		this.id=id;
		this.name=name;
		this.designation=designation;
	}

	public void printDesignation(){
		System.out.println("Designation of Employee"+this.designation);
	}
	
	public void printDetails() {
		System.out.println("Employee");
		System.out.println(" ID = " + this.id);
		System.out.println(" Name = " + this.name);
		System.out.println(" Designation = " + this.designation);
		System.out.println(" Work Hours = " +workHours);
	}
	
	public static void main(String args[]) {
		
		Manager m = new Manager(1,"AB","manager");
		Developer d = new Developer(2,"BC","developer");
		
		m.idOfManager();
		d.nameOfDeveloper();

		System.out.println();
		
		m.printDetails();
		d.printDetails();
		
		System.out.println();

		Employee e = new Employee(3,"CD","not yet assigned"); 						
		e.printDetails();
		System.out.println();
		m.printDetails(); 									
		System.out.println();
		d.printDetails(); 									
		System.out.println();
		
		e.printDesignation();
	}
}

class Manager extends Employee {

	public Manager(int id,String name,String designation){
		super(id,name,designation);
	}

	public void idOfManager(){
		System.out.println("ID of Manager"+this.id);
	}

	@Override
	public void printDetails() {
		System.out.println("Manager");
		System.out.println(" ID = " + this.id);
		System.out.println(" Name = " + this.name);
		System.out.println(" Designation = " + this.designation);
		System.out.println(" Work Hours = " + workHours);
	}
}

class Developer extends Employee {

	public Developer(int id,String name,String designation){
		super(id,name,designation);
	}

	public void nameOfDeveloper(){
		System.out.println("Name of Developer"+this.name);
	}

	@Override
	public void printDetails() {
		System.out.println("Developer");
		System.out.println(" ID = " + this.id);
		System.out.println(" Name = " + this.name);
		System.out.println(" Designation = " + this.designation);
		System.out.println(" Work Hours = " + workHours);
	}
}