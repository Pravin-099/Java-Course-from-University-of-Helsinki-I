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
public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;
    
    public UserInterface(TodoList toDoList, Scanner scanner){
        this.toDoList = toDoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            if(command.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                toDoList.add(toAdd);
            }
            if(command.equals("list")){
                toDoList.print();
            }
            if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int id = Integer.valueOf(scanner.nextLine());
                toDoList.remove(id);
            }
                
            
        }
    }
}
