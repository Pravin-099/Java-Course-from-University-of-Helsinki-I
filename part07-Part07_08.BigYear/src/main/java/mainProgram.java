
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<BirdWatcher> birds = new ArrayList<>();
        
        UserInterface ui = new UserInterface(scan,birds);
        
        ui.start();

    }

}
