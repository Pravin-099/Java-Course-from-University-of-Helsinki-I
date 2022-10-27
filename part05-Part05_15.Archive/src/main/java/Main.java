
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();
        boolean itemOnList = false;
        
        while(true){
            
            System.out.println("Identifier? (empty will stop)");
            String identifier = s.nextLine();
            if(identifier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = s.nextLine();
            if(name.isEmpty()){
                break;
            }
            for(Archive item:items ){
                if(item.getIdentifier().equals(identifier)){
                    itemOnList = true;
                }
            }
            if(itemOnList==false){
                items.add(new Archive(identifier,name));
            }
        }
        
        System.out.println("==Items==");
        for(Archive item: items){
            
            System.out.println(item.getIdentifier()+": "+item.getName());
        }


    }
}
