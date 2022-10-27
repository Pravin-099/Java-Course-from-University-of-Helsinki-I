

import java.util.Scanner;
import java.util.ArrayList;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        
        int searching = Integer.valueOf(scanner.nextLine());

        // Implement the search functionality here
        Boolean a =false;
        int b=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==searching){
                a =true;
                b=i;
                break;
            }
         
        }
        if(a==true){
            System.out.println(searching+" is at index "+b+".");
        }else{
            System.out.println(searching+" was not found.");
        }
        
        
        
           
            
        
        
        
        
    }

}
