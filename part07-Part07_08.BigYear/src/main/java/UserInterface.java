/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scan;
    private ArrayList<BirdWatcher> birds;
    
    public UserInterface(Scanner scan, ArrayList<BirdWatcher> birds){
        this.scan = scan;
        this.birds = birds;
    }
    
    public void start(){
        while(true){
            System.out.println("?");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                break;
            }else if(command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String nameInLatin = scan.nextLine();
                birds.add(new BirdWatcher(name, nameInLatin));
                
            }else if(command.equals("Observation")){
                System.out.println("Bird?");
                String birdss = scan.nextLine();
                birdObservation(birdss);
                
            }else if(command.equals("All")){
                
                printbirds();
                
            }else if(command.equals("One")){
                System.out.println("Bird?");
                String bird = scan.nextLine();
                printOneBird(bird);
            }
            
        }
    }
    
    public void birdObservation(String bird){
        boolean contains = true;
        for(BirdWatcher birdss: birds){
            if(birdss.getBirdName().equals(bird)){
                birdss.setObservation();
                contains = false;
            }
        }
        if(contains){
            System.out.println("Not a bird!");
        }
    }
    
    public void printbirds(){
        for(BirdWatcher bird: birds){
            System.out.println(bird.getBirdName()+"("+bird.getBirdNameInLatin()+"): "+bird.getObservation()+" observations");
        }
    }
    
    public void printOneBird(String bird){
        for(BirdWatcher birdss: birds){
            if(birdss.getBirdName().equals(bird)){
                System.out.println(birdss.getBirdName()+"("+birdss.getBirdNameInLatin()+"): "+birdss.getObservation()+" observations");
            }
        }
    }
    
}
