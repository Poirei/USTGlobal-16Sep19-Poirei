public class TestA {
	public static int add (int a, int b) {
		System.out.println("add(int a, int b) method.");
		return a + b;
	}
	public static int add (int a, byte b) {
		System.out.println("add(int a, byte b) method.");
		return a + b;
	}
	public static long add (long a, byte b) {
		System.out.println("add(long a, byte b) method.");
		return a + b;
	}
	public float multiply (int a, float f) {
		System.out.println("multiply(int a, float f) method.");
		return a * f;
	}
	public int multiply (int a, int b) {
		System.out.println("multiply(int a, int b) method.");
		return a * b;
	}
	public static void main(String[] args) {
		TestA a = new TestA();
		int arr[] = {10, 20};
		main(arr);
		add (10, 20);
		add (40, -127);
		add (9791081, 17);
		a.multiply (4, 6.8f);
	}
	public static void main(int[] args) {
		System.out.println("main(int[] args) method.");
	}
}
