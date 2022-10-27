
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=Integer.valueOf(s.nextInt());
        for(int j=i;j<=100;j++){
            System.out.println(j);
        }

    }
}
