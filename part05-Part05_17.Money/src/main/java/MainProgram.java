
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        
        Money firstMoneyObject = new Money(10, 0);
        Money secondMoneyObject = new Money(2, 0);
        Money firstMinusSecond = firstMoneyObject.minus(secondMoneyObject); 
        System.out.println(firstMinusSecond.euros());
    }
}
