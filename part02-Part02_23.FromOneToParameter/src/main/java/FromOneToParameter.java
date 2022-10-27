import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num= Integer.valueOf(s.nextLine());
        printUntilNumber(num);
        

    }
    public static void printUntilNumber(int i){
        int j=1;
        while(j<=i){
            System.out.println(j);
            j++;
        }
    }

}
