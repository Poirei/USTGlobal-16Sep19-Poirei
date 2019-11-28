import java.util.Scanner;
class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight : ");
        double weight = sc.nextInt();
        System.out.println("Enter the height : ");
        double height = sc.nextInt();
        System.out.println("Your BMI is : "+(weight / (height * height)));
    }
}