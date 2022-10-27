
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give the first number:");
        int a = Integer.valueOf(s.nextLine());
        System.out.println("Give the second number:");
        int b= Integer.valueOf(s.nextLine());
        System.out.println("Give the third number:");
        int c = Integer.valueOf(s.nextInt());
        
        
        double d = (double) (a+b+c)/3;
        
        System.out.println("The average is "+ d);


    }
}
