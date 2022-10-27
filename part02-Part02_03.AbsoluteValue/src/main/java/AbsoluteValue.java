
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.valueOf(s.nextInt());
        if(a<0){
            System.out.println(a*(-1));
        }else{
            System.out.println(a);
        }

    }
}
