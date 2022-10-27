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

public class UserInterFace {
    
    private Scanner scanner;
    private RecipeList recipes;
    
    public UserInterFace(Scanner scanner ,RecipeList recipes){
        this.scanner = scanner;
        this.recipes = recipes;
    }
    
    public void start(){
        
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        
        recipes.readFile(fileName);
        
        System.out.println("Commands:"+"\n"+"list - lists the recipes"+"\n"+"list - lists the recipes"+"\n"+"find name - searches recipes by name"+"\n"+"find cooking time - searches recipes by cooking time"+"\n"+"find ingredient - searches recipes by ingredient");
        System.out.println("");
        
        while(true){
            
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            
            if(command.equals("stop")){
                
                break;
                
            }else if(command.equals("list")){
                System.out.println("");
                System.out.println("Recipes:");
                recipes.printRecipeList();

            }else if(command.equals("find name")){
                
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipes.searchRecipe(word);
                
            }else if(command.equals("find cooking time")){
                
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                recipes.searchRecipeByTime(maxTime);
                
            }else if(command.equals("find ingredient")){
                
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                recipes.searchRecipeByIngredient(ingredient);
            }
        }
    }
    
    
    
}
