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

public class Points {
    private ArrayList<Integer> points;
    
    public Points(){
        points = new ArrayList<>();
    }
    
    public void add(int points){
        this.points.add(points);
    }
    
    public double average(){
        double avg =0;
        for(Integer average: this.points){
            avg = (avg + average);
        }
        double average = avg/this.points.size();
        
        return average;
    }
    
    public String passingGrade(){
        double avg = 0;
        double count = 0;
        for(Integer average: this.points){
            if(average >49){
                avg = (avg + average);
                count++;
            }
            
        }
        double average = avg/count;
        
        if(average > 49){
            return String.valueOf(average);
        }else{
            return "-";
        }
    }
    
    public double passPercentage(){
        double avg = 0;
        double count = 0;
        for(Integer average: this.points){
            if(average >49){
                avg = (avg + average);
                count++;
            }
            
        }
        double average = avg/count;
        double percentage = 100* (count/points.size());
        
        if(average > 49){
            return percentage;
        }else{
            return 0.0;
        }
        
    }
    
    public void grades(){
        
        ArrayList<Integer> grades = new ArrayList();
        for(Integer gradess: this.points){
            int grade = 0;
            if(gradess < 50){
                grade = 0;
            }else if(gradess < 60){
                grade = 1;
            }else if(gradess < 70){
                grade = 2;
            }else if(gradess < 80){
                grade = 3;
            }else if(gradess < 90){
                grade = 4;
            }else {
                grade = 5;
            }
            grades.add(grade);
        }
        int grade = 5;
        while(grade >= 0){
           int star =0;
           for(Integer gradess: grades){
               if(gradess == grade){
                   star++;
               }   
           }    
            
            System.out.print(grade + ": ");
            
            while(star > 0){
                System.out.print("*");
                star--;
            }
            System.out.println("");
            grade = grade-1;
        }
    }
}
