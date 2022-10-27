
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal(String meal){
       boolean contain = false;
       for(String mea: this.meals){
           if(mea.equals(meal)){
               contain = true;
           }
           
       }
       if(contain == false){
           this.meals.add(meal);
       }
            
        
        
    }
    
    public void printMeals(){
        for(String mealss: this.meals){
            System.out.println(mealss);
        }
    }
    public void clearMenu(){
        
            this.meals.removeAll(meals);
        
    }
}
