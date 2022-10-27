
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give a number:");
        int n=Integer.valueOf(s.nextLine());
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        System.out.println("Factorial: "+result);

    }
}
