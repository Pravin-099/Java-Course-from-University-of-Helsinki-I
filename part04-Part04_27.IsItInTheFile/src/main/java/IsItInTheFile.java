
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean a= false;
        String b="s";
        try(Scanner s = new Scanner(Paths.get(file))){
            while(s.hasNextLine()){
                b = s.nextLine();
                if(b.equals(searchedFor)){
                    a = true;
                    break;
                }
            }
            if(a==true){
                    System.out.println("Found!");
                }else{
                    System.out.println("Not found.");
                }

            System.out.println(b);
        }
        catch(Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }

        

    }
}
