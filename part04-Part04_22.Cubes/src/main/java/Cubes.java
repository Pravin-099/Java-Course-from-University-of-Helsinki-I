
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            String input = s.nextLine();
            if(input.equals("end")){
                break;
            }else{
                int cube = Integer.valueOf(input);
                
                System.out.println(cube*cube*cube);
            }
        }
        

    }
}
