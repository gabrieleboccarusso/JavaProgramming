import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if((this.currentWeight + suitcase.totalWeight()) <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.currentWeight += suitcase.totalWeight();  
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight + " kg)"; 
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }
}
