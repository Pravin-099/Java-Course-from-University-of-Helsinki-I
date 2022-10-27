
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here.
        System.out.println("Enter the first string:");
        String a = s.nextLine();
        String b = s.nextLine();
        if(a.equals(b)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
