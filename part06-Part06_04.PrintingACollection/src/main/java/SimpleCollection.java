
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if(elements.isEmpty()){
            return "The collection "+this.name+" is empty.";
        }
        String listContains = "";
        for(String elementsOnList: this.elements){
            listContains = listContains+elementsOnList+"\n";
        }
        if(elements.size()==1){
            listContains = elements.get(0);
            return "The collection "+this.name+" has "+this.elements.size()+" element:"+"\n"+listContains;
        }
        return "The collection "+this.name+" has "+this.elements.size()+" elements:"+"\n"+listContains;
    }
    
}
