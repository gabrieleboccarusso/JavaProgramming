import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        boolean goOn = true;
        String command;
        
        while(goOn) {
            System.out.println("Command: ");
            command = scanner.nextLine();
            
            switch(command) {
                case "end":
                    goOn = false;
                    System.out.println("Bye bye!");
                    break;
                case "add":
                    addToDict();
                    break;
                case "search":
                    searchInDict();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
    
    private void addToDict() {
        String word, translation;
        System.out.println("Word: ");
        word = scanner.nextLine();
        System.out.println("Translation: ");
        translation = scanner.nextLine();
        dict.add(word, translation);
    }
    
    private void searchInDict() {
        String word, translation;
        System.out.println("To be translated: ");
        word = this.scanner.nextLine();
        translation = this.dict.translate(word);
        
        if (translation == null) {
            System.out.println("Word "+ word +" was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
