
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
        
            String a = s.nextLine();
            if(a.equals("")){              
                break;
            }else{
                String[] c = a.split(" ");
                for(int i=0;i<c.length;i++){
                    System.out.println(c[i]);
                }
            }
            
            
        }
        
        
        
        
        


    }
}
