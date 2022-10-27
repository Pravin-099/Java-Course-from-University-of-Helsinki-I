
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String fileName = s.nextLine();
        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNextLine()){
                String contains = scan.nextLine();
                System.out.println(contains);
            }
        }
        catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

    }
}
