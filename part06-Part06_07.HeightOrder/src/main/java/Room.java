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
public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return persons;
    }
    
    public Person shortest(){
        
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = persons.get(0);
        for(Person personss: persons){
            if(personss.getHeight() < shortest.getHeight()){
                shortest = personss;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = this.shortest();
        persons.remove(this.shortest());
        return shortest;
    }
}
