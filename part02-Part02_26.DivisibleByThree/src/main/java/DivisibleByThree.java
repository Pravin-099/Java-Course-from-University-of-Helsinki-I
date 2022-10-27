
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = Integer.valueOf(s.nextLine());
        int l= Integer.valueOf(s.nextLine());
        divisibleByThreeInRange(f,l);

    }
    
    public static void divisibleByThreeInRange(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

}
