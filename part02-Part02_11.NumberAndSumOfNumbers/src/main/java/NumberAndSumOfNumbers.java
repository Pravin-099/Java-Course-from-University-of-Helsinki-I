
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=0;
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(s.nextLine());
            if(a!=0){
                num++;
                sum=sum+a;
                continue;
            }
            
            break;
            
            
        }
        
        System.out.println("Number of numbers: "+num);
        System.out.println("Sum of the numbers: "+sum);

    }
}
