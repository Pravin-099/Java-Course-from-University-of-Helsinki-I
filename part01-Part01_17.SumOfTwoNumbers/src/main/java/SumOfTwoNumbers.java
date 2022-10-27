
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        
        int a= Integer.valueOf(s.nextLine());
        
        System.out.println("Give the second number:");
        
        int b= Integer.valueOf(s.nextLine());
        
        int c= a+b;
        
        System.out.println("The sum of the numbers is " + c);
    }
}
