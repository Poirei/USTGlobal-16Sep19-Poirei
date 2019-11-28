
public class TestB {
	static int a = 25;
	int x;
	public static void main(String[] args) {
		add();
		TestB tb = new TestB();
		System.out.println("x value is : "+tb.x);
	}
	public static void add() {
		final int a = 1;
		int b = 40;
		System.out.println(a);
		System.out.println(b);
	}
}
