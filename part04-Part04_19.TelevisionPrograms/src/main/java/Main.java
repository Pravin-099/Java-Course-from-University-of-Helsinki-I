import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Name: ");
            String name = s.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(s.nextLine());
            
            programs.add(new TelevisionProgram(name,duration));
        }
        System.out.println("Program's maximum duration?");
        
        int maximumNumber = Integer.valueOf(s.nextLine());
        
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maximumNumber){
                System.out.println(program);
            }
        }
         

    }
}
