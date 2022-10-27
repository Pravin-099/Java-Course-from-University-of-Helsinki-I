
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        
        while(true){
            
            int point = Integer.valueOf(scanner.nextLine());
            
            if(point==-1){
                break;
            }
            
            if(point > -1 && point < 101){
                points.add(point);
            }
        }
        System.out.println("Point average (all): "+points.average());
        System.out.println("Point average (passing): "+points.passingGrade());
        System.out.println("Pass percentage: "+points.passPercentage());
        System.out.println("Grade distribution:");
        points.grades();
    }
}
