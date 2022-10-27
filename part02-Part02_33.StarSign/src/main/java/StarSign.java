import java.util.Scanner;
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        
        Scanner scanner = new Scanner(System.in);
System.out.print("Customer number: ");
int y = Integer.valueOf(scanner.nextLine());

if (y >= 1000 && y % 25 == 0) {
    System.out.println("Gets a gift card!");
} else if (y % 2000 == 0) {
    System.out.println("Gets a large gift card!");
} else {
    System.out.println("Gets nothing.");
}
}
}
