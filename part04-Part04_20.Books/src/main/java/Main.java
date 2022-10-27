import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner S = new Scanner(System.in);
        ArrayList<Books> Book = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String titleName = S.nextLine();
            
            if(titleName.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(S.nextLine());
            System.out.println("Publication year:");
            int year = Integer.valueOf(S.nextLine());
            
            Book.add(new Books(titleName,pages,year));
        }
        
        System.out.println("What information will be printed?");
        
        String whatPrint = S.nextLine();
        if(whatPrint.equals("everything")){
            for(Books Books: Book){
                System.out.println(Books);
            }
        }else{
            for(Books Books: Book){
                System.out.println(Books.getName());
            }
        }

    }
}
