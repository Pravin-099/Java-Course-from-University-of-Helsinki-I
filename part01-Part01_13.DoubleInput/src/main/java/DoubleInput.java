
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        double d = s.nextDouble();
        System.out.println("You gave the number "+d);

    }
}
