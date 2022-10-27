/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class BirdWatcher {
    private String name;
    private String nameInLatin;
    private int observation;
    
    public BirdWatcher(String name, String nameInLatin){
        this.name = name;
        this.nameInLatin = nameInLatin;
        observation = 0;
    }
    
    public String getBirdName(){
        return this.name;
    }
    
    public String getBirdNameInLatin(){
        return this.nameInLatin;
    }
    
    public int getObservation(){
        return this.observation;
    }
    
    public void setObservation(){
        this.observation = this.observation+1;
    }
    
    
    
    
}
