import java.util.Scanner;

class SwitchRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println ("Enter the character : ");
        char c[] = s.next().toCharArray();
        switch (c) {
            case 'A':
                System.out.println ((int)'A');
                break;
        
            default:
                break;
        }
    }
}