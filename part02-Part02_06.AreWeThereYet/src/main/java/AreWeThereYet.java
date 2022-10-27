
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 0;

    while (true) {
        number = number + 1;

        if (number >= 5) {
            break;
        }

        if (number < 5) {
            continue;
        }

        System.out.print(number + " ");
    }

    

    }
}
