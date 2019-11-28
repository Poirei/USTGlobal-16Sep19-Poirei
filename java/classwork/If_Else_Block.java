class If_Else_Block {
    public static void main(String[] args) {
        int marks = 79;
        if (marks >= 70) {
            System.out.println ("FCD.");
        }
        else if (marks >= 60) {
            System.out.println ("FC.");
        }
        else if (marks >= 50) {
            System.out.println ("SC.");
        }
        else if (marks < 35) {
            System.out.println ("Better luck next time.");
        }
    }
}