
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        RecipeList recipes = new RecipeList();
        Scanner scanner = new Scanner(System.in);
        
        UserInterFace ui = new UserInterFace(scanner,recipes);
        
        ui.start();

    }

}
