
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int a= Integer.valueOf(s.nextLine());
            if(a!=0){
                sum=sum+a;
                continue;
            }
            break;
        }
        System.out.println("Sum of the numbers: "+sum);

    }
}
