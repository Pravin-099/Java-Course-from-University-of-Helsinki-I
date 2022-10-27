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
public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack(){
        stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(this.stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        int index = this.stack.size()-1;
        
        String lastValue = this.stack.get(index);
        this.stack.remove(index);
        
        return lastValue;
    }
    
}
