
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Last number? ");
        int l = Integer.valueOf(s.nextInt());
        int result = 0;
        for(int i=0; i<=l;i++){
            result=result+i;
        }
        System.out.println("The sum is "+ result);

    }
}
