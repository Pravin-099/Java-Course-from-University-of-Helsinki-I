/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {
    private ArrayList<Recipe> recipes = new ArrayList<>();
    
    public void readFile(String fileName){
 
        try(Scanner scan = new Scanner(Paths.get(fileName))){
            while(scan.hasNextLine()){
                String name = scan.nextLine();
                int time = Integer.valueOf(scan.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                
                    
                while(scan.hasNextLine()){
                    String ingredient = scan.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    
                    ingredients.add(ingredient);
                    
                       
                }
                recipes.add(new Recipe(name,time,ingredients));
                
                
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
    
    public void printRecipeList(){
        for(Recipe recipe: recipes){
                    
            System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getTime());
        
        }
   }
    
   public void searchRecipe(String word){
       for(Recipe recipe: recipes){
            if(recipe.getName().contains(word)){
                
                System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getTime());
                        
            }

        }
   }
   
   public void searchRecipeByTime(int time){
       for(Recipe recipe: recipes){
            if(recipe.getTime() <= time){
                System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getTime());
                        
            }
 
       }
   }
   
   public void searchRecipeByIngredient(String ingredient){
       for(Recipe recipe: recipes){
            if(recipe.findIngredients(ingredient)){
                System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getTime());
            }else{
                 System.out.println("");
            }
   
        }
   }
   
   
}
