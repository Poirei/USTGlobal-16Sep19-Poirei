
public class Emp {
	String name;
	int id;
	
	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	void printDetails() {
		System.out.println("The employee name is "+name);
		System.out.println("The employee id is "+id);
		this.sayHello();
	}
	
	void sayHello() {
		System.out.println("Hello "+name+"! Welcome to UST GLOBAL.");
	}
	
	public static void main(String[] args) {
		Emp e1 = new Emp("Sasuke", 123);
		e1.printDetails();
		Emp e2 = new Emp("Naruto", 432);
		e2.printDetails();
		Emp e3 = new Emp("Itachi", 408);
		e3.printDetails();
	}
}
