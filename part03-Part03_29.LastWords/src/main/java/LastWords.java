
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String a = s.nextLine();
            if(a.equals("")){
                break;
            }else{
                String b[]= a.split(" ");
                int c = b.length-1;
                System.out.println(b[c]);
            }
            
        }



    }
}
