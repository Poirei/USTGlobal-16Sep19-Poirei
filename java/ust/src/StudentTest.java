
public class StudentTest {

	public static void main(String[] args) {
		Student.cname = "QSpIders";
		Student s1 = new Student();
		s1.name = "POirei";
		s1.usn = 104;
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("ID is "+s1.usn);
	}
}
