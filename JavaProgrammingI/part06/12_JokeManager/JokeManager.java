import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes;
    
    public JokeManager() {
        this.jokes = new ArrayList<String>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        Random draw = new Random();
        String joke;
        
        if (this.jokes.size() != 0) {
            joke = this.jokes.get(draw.nextInt(this.jokes.size()));
        } else {
            joke = "Jokes are in short supply.";
        }
        
        return joke;
    }
    
    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
