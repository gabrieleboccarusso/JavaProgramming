import java.util.ArrayList;

public class Stack {
    private ArrayList items;
    
    public Stack() {
        items = new ArrayList<String>();
    }
    
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    
    public void add(String item) {
        this.items.add(item);
    }
    
    public ArrayList<String> values() {
        return this.items;
    }
    
    public String take() {
        return String.valueOf(this.items.remove(this.items.size()-1));
    }
}
