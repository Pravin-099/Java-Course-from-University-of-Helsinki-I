
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How old are you? ");
        int a = Integer.valueOf(s.nextInt());
        if((a>=0 && a<=120)){
            System.out.println("OK");
        }else{
            System.out.println("Impossible!");
        }

    }
}
