
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int a = Integer.valueOf(s.nextLine());
        System.out.println("Give the second number:");
        int b= Integer.valueOf(s.nextLine());
        
        float c = (float) (a+b)/2;
        
        System.out.println("The average is "+ c);

    }
}
