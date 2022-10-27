
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int a;
        
        
        while(true){
            a = Integer.valueOf(scanner.nextLine());
            if(a==9999){
                break;
            }
            l.add(a);
        }
        int num = l.get(0);
        
        for(int i=0;i<l.size();i++){
            if(l.get(i)< num){
                num = l.get(i);
            }
            
        }
        System.out.println("Smallest number: "+num);
        for(int i=0;i<l.size();i++){
            if(l.get(i)==num){
                System.out.println("Found at index: "+ i);
            }
        }

        
    }
}
