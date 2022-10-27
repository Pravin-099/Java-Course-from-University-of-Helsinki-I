
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner s = new Scanner(Paths.get(file))){
            while(s.hasNextLine()){
                String contains = s.nextLine();
                
                String[] contain = contains.split(",");
                
                if(Integer.valueOf(contain[1])==1){
                    System.out.println(contain[0]+","+" age: "+contain[1]+" year");
                }else{
                    System.out.println(contain[0]+","+" age: "+contain[1]+" years");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
