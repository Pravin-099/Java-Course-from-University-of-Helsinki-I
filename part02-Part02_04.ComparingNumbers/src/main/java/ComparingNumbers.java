
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.valueOf(s.nextLine());
        int b = Integer.valueOf(s.nextLine());
        
        if(a > b)
            System.out.println(a+ " is greater than "+ b+".");
        else if(a<b)
            System.out.println(a+ " is smaller than "+ b+".");
        else
            System.out.println(a+ " is equal to "+ b+".");
        

    }
}
