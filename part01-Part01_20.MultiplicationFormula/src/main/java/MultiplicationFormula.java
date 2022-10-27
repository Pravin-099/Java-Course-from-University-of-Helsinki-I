
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give the first number:");
        
        int a = Integer.valueOf(s.nextLine());
        
        System.out.println("Give the second number:");
        
        int b = Integer.valueOf(s.nextInt());
        
        System.out.println(a + " * " + b + " = " + (a*b));

    }
}
