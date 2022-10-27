
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(Paths.get("data.txt"))){
            while(s.hasNextLine()){
                String contains = s.nextLine();
                
                System.out.println(contains);
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
