
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int apartmentPrice = (this.squares*this.princePerSquare);
        int apartmentComparedPrice = (compared.squares*compared.princePerSquare);
        
        int priceDifference= (apartmentPrice - apartmentComparedPrice);
        
        if(priceDifference < 0){
            return ((priceDifference)*(-1));
        }else{
            return priceDifference;
        }
        
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        int apartmentPrice = (this.squares*this.princePerSquare);
        int apartmentComparedPrice = (compared.squares*compared.princePerSquare);
        
        if(apartmentPrice > apartmentComparedPrice){
            return true;
        }else{
            return false;
        }
    }

}
