
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("First number?");
        int f = Integer.valueOf(s.nextLine());
        System.out.println("Last number?");
        int l = Integer.valueOf(s.nextLine());
        int result=0;
        for(int i=f;i<=l;i++){
            result=result+i;
        }
        System.out.println("The sum is: "+result);

    }
}
