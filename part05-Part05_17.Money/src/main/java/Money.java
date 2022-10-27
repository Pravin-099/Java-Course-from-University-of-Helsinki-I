
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
    
    int euros = (this.euros+addition.euros);
    int cents= (this.cents+addition.cents);
    Money newMoney = new Money(euros,cents); // create a new Money object that has the correct worth
    
    
    // return the new Money object
    return newMoney;
    }
    public boolean lessThan(Money compared){
        int cent;
        int centC;
        if(this.euros < 0){
            cent = this.cents*(-1);
            
            if(this.euros < compared.euros && cent < compared.cents){
               return true; 
            }
            
        }
        if(compared.euros < 0){
            centC = compared.cents*(-1);
            
            if(this.euros < compared.euros && this.cents < centC){
               return true; 
            }else{
                return false;
            }
            
        }
        if(this.euros < compared.euros){
            return true;
            
        }
        if(this.euros > compared.euros){
            return false;
        }
        if(this.cents < compared.cents){
            return true;
        }
        
        return false;
        
    }  
    
    public Money minus(Money decreaser){
        double euro = (this.euros*100)/100;
        double cent = ((this.cents));
        cent = (cent/100);
        double euroC = (decreaser.euros*100)/100;
        double centC = ((decreaser.cents));
        centC = (centC/100);
        
        double newEuro = (euro-euroC);
        double newCent = (cent+centC);
        
        double newMoney = (newEuro-newCent);
        int cent1;
        int centC1;
        if(this.cents == 0){
            cent1 = (this.cents+100);
        }else{
            cent1 = (this.cents);
        }
        if(decreaser.cents == 0){
            centC1 = (decreaser.cents+100);
        }else{
            centC1 = decreaser.cents;
        }
        
        
        
        int newCent1 = (cent1-centC1);
        
        if(newCent1 < 0){
            newCent1 = newCent1*(-1);
        }
        
        int newMoney1 = (int) newMoney;
        
        
        if(newMoney1 < 0){
            Money d = new Money(0,0);
            return d;
        }else{
            Money d = new Money(newMoney1,newCent1);
            return d;
        }
        
        
            
        
    }
    

}
