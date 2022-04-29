import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;
    
    public Suitcase(int maxWeight) {
        items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }
    
    public void addItem(Item item) {
        if ((this.currentWeight + item.getWeight()) <= this.maxWeight) {
            items.add(item);
            this.currentWeight += item.getWeight();
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        if (this.items.size() == 0) {
            output = "no items (0 kg)";
        } else {
            output = this.items.size() + " item";
            if (this.items.size() > 1) { output += "s"; }
            output += " (" +this.currentWeight + " kg)";
        }
        
        return output;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.currentWeight;
    }
    
    public Item heaviestItem() {
        Item heaviest = null;
        
        if(!this.items.isEmpty()) {
            heaviest = this.items.get(0);
            for(Item item : this.items) {
                if (item.getWeight() > heaviest.getWeight()) {
                    heaviest = item;
                }
            }
        }
        
        return heaviest;
    }
}
