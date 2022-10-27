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
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task){
        this.list.add(task);
    }
    
    public void print(){
        
        for(String lists: this.list){
            System.out.println((this.list.indexOf(lists)+1)+": "+lists);
        }
    }
    public void remove(int number){
        list.remove(number-1);
    }
}
