
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count =0;
        int sum =0;
        int l =0;
        String d="gg";
        while(true){
            String a = s.nextLine();
            if(a.equals("")){
                break;
            }else{
                String b[] = a.split(",");
                int c = Integer.valueOf(b[0].length());
                if(c>l){
                    l=c;
                    d=b[0];
                }
                sum= sum+Integer.valueOf(b[1]);
                count++;
                
            }
        }
        System.out.println("Longest name: "+d);
        System.out.println("Average of the birth years: "+ (double)sum/count);


    }
}
