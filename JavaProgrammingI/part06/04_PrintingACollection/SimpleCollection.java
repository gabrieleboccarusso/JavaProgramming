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
    
    public String toString() {
        int i;
        String output = "The collection " + this.name; 
        
        if (this.elements.size() == 0) {
            output += " is empty.";
        } else {
            output += " has " + this.elements.size() + " element";
            if (this.elements.size() > 1) { output += "s"; }
            output += ":\n";
            
            for(i = 0; i < this.elements.size()-1; i++) {
                output += this.elements.get(i) + "\n";
            }
            output += this.elements.get(i++);
        }
        
        return output;
    }
}
