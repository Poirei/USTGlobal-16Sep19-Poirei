import java.util.Scanner;

class Sum10 {
	public static void main (String args[]) {
	Scanner s = new Scanner (System.in);
	int[] arr = new int[10];
	int sum = 0;
	System.out.println ("Enter the nos. : ");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = s.nextInt();
		}
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
		}
	System.out.println ("Sum = " + sum);
	}
}