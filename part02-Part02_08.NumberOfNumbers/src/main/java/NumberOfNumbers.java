
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(s.nextInt());
            if (a<0||a>0){
                count++;
            }
            if (a==0){
                break;
            }
            
        }
        System.out.println("Number of numbers: "+count);

    }
}
