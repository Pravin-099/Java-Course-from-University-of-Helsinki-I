
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give a string: ");
        String a = s.nextLine();
        if(a.equals("true")){
            System.out.println("You got it right!");
        }else{
            System.out.println("Try again!");
        }

    }
}
