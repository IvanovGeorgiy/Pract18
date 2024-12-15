import java.util.Scanner;

public class Ex {
    public void ex() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an int ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            //System.out.println(i);
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("division by zero");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter int in in proper format");
        }
    }
    public void ex2() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter int ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            } catch (Exception e) {
                System.out.println("division by zero");
            }
        } catch (Exception e) {
            System.out.println("Enter int in in proper format");
        }
        finally {
            System.out.println("f");
        }
    }
}
