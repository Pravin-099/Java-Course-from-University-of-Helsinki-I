
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    
    public boolean equals (Object compared){
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Person)) {
            return false;
        }
        
        Person personCompared = (Person) compared;

        // if the object's values are the same, the objects are the same
        if (this.name.equals(personCompared.name) && this.birthday.equals(personCompared.birthday)
                && this.height == personCompared.height
                && this.weight == personCompared.weight) {
            return true;
        }else{
            return false;
        }
    }
}
