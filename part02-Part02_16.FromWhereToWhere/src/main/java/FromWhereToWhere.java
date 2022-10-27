
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Write your program here
        int whereTo =0;
        int fromWhere =0;
        System.out.println("Where to? ");
        whereTo = Integer.valueOf(s.nextLine());
        
        System.out.println("Where from? ");
        fromWhere = Integer.valueOf(s.nextLine());
        for(int i=fromWhere;i<=whereTo;i++){
            
            System.out.println(i);
        }
    }
}
