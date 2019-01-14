import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Comparator;;

class FinalClass{
    static TreeSet<Employee> sortEmployeeByName(Company c) {
		TreeSet<Employee> eSet = new TreeSet<>(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				int temp = o1.getName().compareToIgnoreCase(o2.getName());
				if(temp == 0) {
					temp = ((int)o1.getID().charAt(0) > (int)o2.getID().charAt(0)) ?
							1 :
							((int)o1.getID().charAt(0) == (int)o2.getID().charAt(0)) ?
									(o1.getAge() > o2.getAge()) ?
											1 :
											(o1.getAge() == o2.getAge()) ?
													0 :
													-1 :
									-1;
				}

				return temp;
			}
		});
		for(Employee e : c.getEmployeeSet()) {
			eSet.add(e);
		}

		return eSet;
}
    static void getEmployeeAgeBelow30(Company c) {
		TreeSet<Employee> empSet = c.getEmployeeSet();
		for(Employee e : empSet) {
			if(e.getAge() < 30) {
				System.out.println(e.getName());
			}
		}
	}

    static HashMap<String, ArrayList<String>> companiesInCity(ArrayList<Company> cList) {
		HashMap<String, ArrayList<String>> cMap = new HashMap<>();

		for(Company c : cList) {
			String city = c.getAddress().getCity().toUpperCase();
			if(cMap.containsKey(city)) {
				if(! cMap.get(city).contains(c.getName().toUpperCase())) {
					ArrayList<String> list = cMap.get(city);
					list.add(c.getName().toUpperCase());
					cMap.put(city, list);
				}
			} else {
				ArrayList<String> list = new ArrayList<>();
				list.add(c.getName().toUpperCase());
				cMap.put(city, list);
			}
		}

		return cMap;
        }

    public static void main(String args[]){
        
        ArrayList<Company> company=new ArrayList<Company>();
        company.add(new Company("ABC",new Address("A","Bangalore","Karanataka")));
        company.add(new Company("DEF",new Address("B","Hyderabad","Andhra Pradesh")));
        
        company.get(0).addEmployee(new Employee("awq", "1", 23));
		company.get(0).addEmployee(new Employee("das", "2", 11));
		company.get(0).addEmployee(new Employee("asd","3", 23));

		company.get(1).addEmployee(new Employee("zxc", "1", 55));
		company.get(1).addEmployee(new Employee("cxxc", "2", 55));
        company.get(1).addEmployee(new Employee("rer", "3", 43));
       

        System.out.println("Employees below the age of 30 in :");
		for(Company c : company) {
			System.out.println("\n" + c.getName().toUpperCase());
			getEmployeeAgeBelow30(c);
        }

        System.out.println("Employees sorted according to name in ascending order :");
		for(Company c : company) {
			System.out.println("\n" + c.getName().toUpperCase());
			for(Employee e : sortEmployeeByName(c)) {
				e.printAboutEmployee();
			}
        }

        System.out.println("Companies :");
		HashMap<String, ArrayList<String>> citiesMap = companiesInCity(company);
		for(String key : citiesMap.keySet()) {
			System.out.println("\n" + key);
			for(String c : citiesMap.get(key)) {
				System.out.println(c);
			}
        }

    }
}