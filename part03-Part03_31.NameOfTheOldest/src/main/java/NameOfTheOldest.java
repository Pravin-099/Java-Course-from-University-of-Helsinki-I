
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = 0;
        String d="aa";
        while(true){
            String a = s.nextLine();
            if(a.equals("")){
                break;
            }
            String b[] = a.split(",");
            
            if(Integer.valueOf(b[1])>c){
                c=Integer.valueOf(b[1]);
                d=b[0];
                
            }
        }
        System.out.println("Name of the oldest: "+d);


    }
}
