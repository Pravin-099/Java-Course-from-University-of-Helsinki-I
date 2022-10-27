
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=0;
        while(true){
            String input = s.nextLine();
            if(input.equals("end")){
                break;
            }else{
                count++;
            }
        }
        System.out.println(count);

    }
}
