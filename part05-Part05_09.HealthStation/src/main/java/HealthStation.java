
public class HealthStation {
    private int weighed =0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        int weight = person.getWeight();
        this.weighed = this.weighed + 1;
        return weight;
    }
    
    public void feed(Person person){
        int weight = person.getWeight();
        person.setWeight(weight+1);
    }
    
    public int weighings(){
        return weighed;
    }

}
