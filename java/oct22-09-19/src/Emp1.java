
public class Emp1 {
	String name;
	int eid;
	long aadharNo;

	public Emp1(String name, int eid, long aadharNo) {
		this.name = name;
		this.eid = eid;
		this.aadharNo = aadharNo;
	}
	
	public Emp1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	public Emp1(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	
	public void printDetails() {
		System.out.println("Hi "+name+"! Welcome to UST Global.");
	}
}
