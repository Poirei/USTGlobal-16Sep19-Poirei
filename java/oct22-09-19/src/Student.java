
public class Student {
	String name;
	int age;
	int id;
	long contactNo;
	String email;
	
	public Student(String name, int age, int id, long contactNo, String email) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.contactNo = contactNo;
		this.email = email;
	}

	void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("ID : "+id);
		System.out.println("Contact Number : "+contactNo);
		System.out.println("Email : "+email);
		System.out.println("=======================================================");
	}
	
	public static void main(String[] args) {
		Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
		s1 = new Student("Poirei", 24, 104, 9791301081L, "poirei4@gmail.com");
		s1.displayDetails();
		s2 = new Student("Dean", 34, 107, 8899654123L, "dean@gmail.com");
		s2.displayDetails();
		s3 = new Student("Fox", 26, 108, 3632565981L, "fox2@fox.com");
		s3.displayDetails();
		s4 = new Student("God", 10, 001, 0000011111L, "god@heaven.com");
		s4.displayDetails();
		s5 = new Student("James", 40, 007, 5568901256L, "agent007@mi7.com");
		s5.displayDetails();
		s6 = new Student("Eddie", 36, 103, 9876543210L, "ed.die@hotmail.com");
		s6.displayDetails();
		s7 = new Student("Paul", 39, 506, 6598876345L, "paul.phoenix@tekken.com");
		s7.displayDetails();
		s8 = new Student("King", 55, 692, 5698720143L, "king@tekken.com");
		s8.displayDetails();
		s9 = new Student("Lei", 43, 601, 7789045601L, "lei@hk.com");
		s9.displayDetails();
		s10 = new Student("Anna", 32, 110, 3695478201L, "anna@gmail.com");
		s10.displayDetails();
	}

}
