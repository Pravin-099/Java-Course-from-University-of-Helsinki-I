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
public class Hold {
    private ArrayList<Suitcase> suitCase;
    private int maximumWeight;
    
    public Hold(int maximumWeight){
        this.suitCase = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int totalSuitCaseWeight = 0;
        
        for(Suitcase suitCases: suitCase){
            totalSuitCaseWeight = totalSuitCaseWeight + suitCases.totalWeight();
        }
        
        totalSuitCaseWeight = totalSuitCaseWeight + suitcase.totalWeight();
        
        if(totalSuitCaseWeight < (this.maximumWeight+1)){
            suitCase.add(suitcase);
        }
    }
    
    public String toString(){
        int totalSuitCaseWeight = 0;
        
        for(Suitcase suitCases: suitCase){
            totalSuitCaseWeight = totalSuitCaseWeight + suitCases.totalWeight();
        }
        return this.suitCase.size()+" suitcases "+"("+totalSuitCaseWeight+" kg)";
    }
    
    public void printItems() {
        for(Suitcase suitCases: suitCase){
            suitCases.printItems();
        }
    }
    
}
