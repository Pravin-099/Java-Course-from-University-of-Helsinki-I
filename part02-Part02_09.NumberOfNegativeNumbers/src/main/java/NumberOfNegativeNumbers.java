
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        while(true){
            System.out.println("Give a number:");
            int a = Integer.valueOf(s.nextLine());
            if(a>0){
                continue;
            }
            if(a<0){
                count++;
                continue;
            }
            break;
        }
        System.out.println("Number of negative numbers: "+count);

    }
}
