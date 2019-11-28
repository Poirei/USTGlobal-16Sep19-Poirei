
public class Employee {
	String name;
	int id;
	
	public Employee(String name, int eid) {
		this.name = name;
		id = eid;
	}
	
	void printDetails() {
		System.out.println("The employee name is "+name);
		System.out.println("The employee id is "+id);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Poirei", 404);
		Employee e2 = new Employee("Singha", 144);
		System.out.println(e1);
		System.out.println(e2);
		e1.printDetails();
	}
	@Override
	public String toString() {
		return "The id of "+this.name+" is "+this.id+".";
	}
}
