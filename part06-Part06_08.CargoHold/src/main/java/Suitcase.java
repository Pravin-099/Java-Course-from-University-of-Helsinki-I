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
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight){
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item){
        int totalWeight=0;
        for(Item itemss: items){
            totalWeight = totalWeight+itemss.getWeight();
        }
        totalWeight = totalWeight + item.getWeight();
        if(totalWeight < (this.maximumWeight+1)){
            items.add(item);
        }
    }
    
    public String toString(){
        
        int totalWeight=0;
        for(Item itemss: items){
            totalWeight = totalWeight+itemss.getWeight();
        }
        if(items.size()==0){
            return "no items "+"("+totalWeight+" kg)";
        }
        if(items.size()==1){
            return items.size()+" item "+"("+totalWeight+" kg)";
        }
        return items.size()+" items "+"("+totalWeight+" kg)";
    }
    public void printItems(){
        for(Item itemss: items){
            System.out.println(itemss.getName()+"("+itemss.getWeight()+" kg)");
        }
    }
    
    public int totalWeight(){
        int totalWeight=0;
        for(Item itemss: items){
            totalWeight = totalWeight+itemss.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heavest = items.get(0);
        for(Item itemss: items){
            if(itemss.getWeight() > heavest.getWeight()){
                heavest = itemss;
            }
        }
        return heavest;
    }
    
}
