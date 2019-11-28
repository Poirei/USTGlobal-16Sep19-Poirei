public class Student {
	String name;
	int rollNo;
	final String cname = "QSpiders";
	final int cid;
	
	public Student() {
		cid = 102;
	}
	
	public Student(String name, int rollNo, int cid) {
		this.name = name;
		this.rollNo = rollNo;
		this.cid = cid;
	}
	
	public final void printDetails() {
		System.out.println("Hi " + name + " Welcome to " + cname);
	}
	
	public final void printDetails(String name) {
		System.out.println("Hi " + name + " Welcome to " + cname);
	}
}
