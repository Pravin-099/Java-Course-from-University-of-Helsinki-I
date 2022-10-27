
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
    System.out.println("Input a number");
    int number = Integer.valueOf(s.nextLine());

    if (number == 0) {
        break;
    } else if (number < 0) {
        System.out.println("Unfit number");
        continue;
    }

    System.out.println(number * number);
}


    }
}
