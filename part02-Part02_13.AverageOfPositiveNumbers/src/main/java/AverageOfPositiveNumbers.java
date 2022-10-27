
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pos=0;
        int neg=0;
        int sum=0;
        while(true){
            int a = Integer.valueOf(s.nextLine());
            if(a>0){
                pos++;
                sum=sum+a;
                continue;
            }
            if(a<0){
                neg++;
                continue;
            }
            
            break;
        }
        if(pos>0){
            System.out.println((double)sum/(pos));
        }
        if(pos<=0){
            System.out.println("Cannot calculate the average");
        }

    }
}
