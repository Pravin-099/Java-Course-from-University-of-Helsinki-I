
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int a = Integer.valueOf(s.nextLine());
        if(a==1984){
            System.out.println("Orwell");
        }
    }
}
