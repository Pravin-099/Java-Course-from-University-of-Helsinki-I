
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int a = Integer.valueOf(s.nextLine());
        if(a>999999){
            System.out.println("Tax: "+ ((142100 + (a-1000000) * 0.17)));
        }else if(a>199999){
            System.out.println("Tax: "+ ((22100 + (a-200000) * 0.15)));
        }else if(a>54999){
            System.out.println("Tax: "+ ((4700 + (a-55000) * 0.12)));
        }else if(a>24999){
            System.out.println("Tax: "+ ((1700 + (a-25000) * 0.10)));
        }else if(a>4999){
            System.out.println("Tax: "+ ((100 + (a-5000) * 0.08)));
        }else{
            System.out.println("No tax!");
        }

    }
}
