package practice;


class Company implements Cloneable{
	String name;
	String address;
	Company(String name,String address){
		this.name=name;
		this.address=address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


class EmployeeV implements Cloneable {
	

	int id;
	String name;
	Company company;//shallow copy
	//what is shallow copy and deep copy
	//shallow copy means only the object is copied but the refrance type variable is not copied
	//deep copy means the object and the refrance type variable is also copied
	

	EmployeeV(int id, String name) {
		this.id = id;
		this.name = name;
		this.company = new Company("TechCorp", "123 Tech Street");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		EmployeeV emp=(EmployeeV)super.clone();
		emp.company=(Company) company.clone();//deep copy
		return emp;
	}
}

public class ClonableDemo {
	public static void main(String[] args) {
		EmployeeV emp1 = new EmployeeV(1, "vine");//object creation
		try {
			EmployeeV emp2 = (EmployeeV) emp1.clone();
			System.out.println(emp1 == emp2);//false
			System.out.println("Employee 1: " + emp1.id + ", " + emp1.name+", Company: "+emp1.company.name);
			System.out.println("Employee 2: " + emp2.id + ", " + emp2.name+", Company: "+emp2.company.name);
			System.out.println("Are emp1 and emp2 company refrance is same " + (emp1.company == emp2.company));
			//modifying emp2 details
			emp2.name="Akash";
			emp1.company.name="Wipro";
			emp2.company.name="TCS";	
			System.out.println("Employee 1: " + emp1.id + ", " + emp1.name+", Company: "+emp1.company.name);
			System.out.println("Employee 2: " + emp2.id + ", " + emp2.name+", Company: "+emp2.company.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
