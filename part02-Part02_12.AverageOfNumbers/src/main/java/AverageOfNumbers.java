
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=0;
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(s.nextInt());
            if(a!=0){
                num++;
                sum=sum+a;
                continue;
            }
            break;
        }
        System.out.println("Average of the numbers: "+((double)sum/num));

    }
}
