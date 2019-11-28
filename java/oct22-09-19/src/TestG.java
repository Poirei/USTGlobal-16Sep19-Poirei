
public class TestG {

	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		SubClass sub = new SubClass();
		sub.getSData();
		System.out.println("**************");
		TestG g = new TestG();
		g.add();
		g.add(4);
	}
	
	final void add() {
		System.out.println("add() method.");
	}
	
	final void add(int a) {
		System.out.println("add(int a) method.");
	}
	
}
