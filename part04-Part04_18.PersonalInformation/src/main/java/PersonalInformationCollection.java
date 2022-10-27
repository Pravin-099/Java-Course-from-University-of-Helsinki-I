
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("First name: ");
            String name = s.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            System.out.println("Last name: ");
            String lastName = s.nextLine();
            
            System.out.println("Identification number: ");
            
            String number = s.nextLine();
            
            infoCollection.add(new PersonalInformation(name,lastName,number));
        }
        
        for(int i=0;i<=infoCollection.size()-1;i++){
            System.out.println(infoCollection.get(i).getFirstName()+" "+ infoCollection.get(i).getLastName());
        }

    }
}
