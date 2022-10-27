
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username: ");
        String a = s.nextLine();
        System.out.println("Enter password: ");
        String b= s.nextLine();
        if(a.equals("alex") && b.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }else if(a.equals("emma") && b.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
