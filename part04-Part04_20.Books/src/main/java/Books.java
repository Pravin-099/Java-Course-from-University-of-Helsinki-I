/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Books {
    private String title;
    private int pages;
    private int year;
    
    public Books(String name, int pages, int year){
        this.title = name;
        this.pages = pages;
        this.year = year;
    }
    
    public String getName(){
        return title;
    }
    
    public String toString(){
        return title+ ", "+ pages +" pages, "+year;
    }
    
}
