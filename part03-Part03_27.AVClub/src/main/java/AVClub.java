
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
        
            String a = s.nextLine();
            if(a.equals("")){              
                break;
            }else{
                
                String[] c = a.split(" ");
                for(int i=0;i<c.length;i++){
                    String d = "av";
                    if(c[i].contains(d)){
                        System.out.println(c[i]);
                    }
                   
                }
            }
            
            
        }


    }
}
