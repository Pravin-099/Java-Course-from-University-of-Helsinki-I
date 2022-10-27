/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                
                simpleDictionary.add(word, translation);
            }else if(command.equals("search")){
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                if(simpleDictionary.translate(word) == null){
                    System.out.println("Word "+word+" was not found");
                }else{
                    System.out.println("Translation: "+ simpleDictionary.translate(word));
                }
                
            }
            else{
                System.out.println("Unknown command");
            }
            
            
        }
    }
    
    
    
}
