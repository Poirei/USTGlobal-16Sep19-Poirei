import java.util.Scanner;

class BMI_Range {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter your height : ");
        double height = s.nextDouble();
        System.out.println("Enter your weight : ");
        double weight = s.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println ("You're in the underweight range.");
        } else if (BMI >= 18.5 && BMI <=24.9) {
            System.out.println ("You're in the healthy weight range.");
        } else if (BMI >= 25 && BMI <=29.9) {
            System.out.println ("You're in the overweight range.");
        } else if (BMI >= 30 && BMI <=39.9) {
            System.out.println ("You're in the obese range.");
        }
    }
}