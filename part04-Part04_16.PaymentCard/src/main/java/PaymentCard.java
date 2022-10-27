/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of "+this.balance+" euros";
    }
    
    public void eatAffordably(){
        if(this.balance >=2.60){
            this.balance = this.balance-2.60;  
        }
        
    }
    
    public void eatHeartily(){
        if(this.balance >= 4.60){
            this.balance = this.balance-4.60;  
        }
    }
    
    public void addMoney(double add){
        if(this.balance <150 && add >0){
            this.balance = this.balance + add;
            if(this.balance>150){
                this.balance = this.balance+150-this.balance;
            }
        }
    }
}
