
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        int sum = 0;
        int count =0;
        while(true){
            int a = Integer.valueOf(scanner.nextLine());
        if(a==-1){
            break;
        }
        l.add(a);
        
        count++;
    }
        for(Integer b:l){
            sum=sum+b;
        }
        System.out.println("Average: "+ (double)sum/count);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        
    }
}
