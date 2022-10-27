
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.valueOf(s.nextLine());
        int b= Integer.valueOf(s.nextLine());
        int c = a+b;
        double d = Math.sqrt(c);
        
        System.out.println(d);

    }
}
