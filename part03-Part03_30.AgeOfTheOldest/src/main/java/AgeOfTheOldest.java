
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;
        while(true){
            String a = s.nextLine();
            if(a.equals("")){
                break;
            }
            String b[] = a.split(",");
            
            if(Integer.valueOf(b[1])>c){
                c=Integer.valueOf(b[1]);
                
            }
        }
        System.out.println("Age of the oldest: "+c);


    }
}
