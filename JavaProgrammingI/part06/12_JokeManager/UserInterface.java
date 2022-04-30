import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        boolean goOn = true;
        String command;
        
        while(goOn) {
            System.out.println(
            "Commands:\n" +
            "1 - add a joke\n" +
            "2 - draw a joke\n" +
            "3 - list jokes\n" +
            "X - stop");
            command = this.scanner.nextLine();
            
            switch(command) {
                case "X":
                    goOn = false;
                    break;
                case "1":
                    addJoke();
                    break;
                case "2":
                    System.out.println(this.jokes.drawJoke());
                    break;                
                case "3":
                    this.jokes.printJokes();
                    break;                
            }
        }
    }
    
    private void addJoke() {
        System.out.println("Write the joke to be added:");
        this.jokes.addJoke(scanner.nextLine());
    }
}
