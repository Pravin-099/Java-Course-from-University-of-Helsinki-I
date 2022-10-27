
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        
        System.out.println("Give a year:");
        Scanner s = new Scanner(System.in);
        int a= Integer.valueOf(s.nextInt());
        
        if(((a%100==0)&& (a%400==0)) || (a%4==0)){
            System.out.println("The year is a leap year.");  
        }else{
            System.out.println("The year is not a leap year.");
        }

    }
}
