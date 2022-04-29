import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.people.add(person);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
    public Person shortest() {
        Person shortest = null;
        
        if (!this.people.isEmpty()) {
            shortest = this.people.get(0);
            for (Person person : this.people) {
                if (person.getHeight() < shortest.getHeight()) {
                    shortest = person;
                }
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        Person toTake = null;
        
        if (!this.people.isEmpty()) {
            toTake = this.shortest();
            this.people.remove(toTake);
        }
        
        return toTake;
    }
}
