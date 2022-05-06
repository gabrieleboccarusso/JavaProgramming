import java.util.ArrayList;

public class BirdsDB {
    private ArrayList<String> birds;
    private ArrayList<String> latinBirds;
    private ArrayList<Integer> observations;
    private int size;
    
    public BirdsDB() {
        this.birds = new ArrayList<>();
        this.latinBirds = new ArrayList<>();
        this.observations = new ArrayList<>();
        this.size = 0;
    }
    
    public void add(String name, String latinName) {
        this.birds.add(name);
        this.latinBirds.add(latinName);
        this.observations.add(0);
        this.size++;
    }
    
    public void addObservationTo(String bird) {
        int n = this.birds.indexOf(bird);
        if (n >= 0) {
            this.observations.set(n, this.observations.get(n)+1);
        }
    }
    
    public void printAll() {
        for(int i = 0; i < this.size; ++i) {
            System.out.print(this.birds.get(i) + " ");
            System.out.print("(" + this.latinBirds.get(i) + "): ");
            System.out.print(this.observations.get(i) + " observations\n");
        }
    }
    
    public void printOne(String bird) {
        if (this.size == 0) {
            System.out.println("No birds");
        } else {
            int i = this.birds.indexOf(bird);
            System.out.print(this.birds.get(i) + " ");
            System.out.print("(" + this.latinBirds.get(i) + "): ");
            System.out.print(this.observations.get(i) + " observations\n");
        }
    } 
}
