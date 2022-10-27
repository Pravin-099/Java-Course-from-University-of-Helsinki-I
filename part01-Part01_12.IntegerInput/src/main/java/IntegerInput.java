
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int a= Integer.valueOf(s.nextLine());
        
        System.out.println("You gave the number "+a);


    }
}
