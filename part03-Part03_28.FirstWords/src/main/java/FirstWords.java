
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String a = s.nextLine();
            if(a.equals("")){
                break;
            }else{
                String b[]= a.split(" ");
                System.out.println(b[0]);
            }
            
        }


    }
}
