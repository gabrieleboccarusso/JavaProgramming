import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        boolean goOn = true;
        String command;
        
        while(goOn) {
            System.out.println("Command: ");
            command = this.scanner.nextLine();
            
            switch(command) {
                case "stop":
                    goOn = false;
                    break;
                case "add":
                    addTask();
                    break;
                case "list":
                    this.list.print();
                    break;
                case "remove":
                    removeTask();
                    break;
            }
        }
    }
    
    private void addTask() {
        System.out.println("To add: ");
        this.list.add(this.scanner.nextLine());
    }
    
    private void removeTask() {
        System.out.println("Which one is removed?");
        this.list.remove(Integer.valueOf(this.scanner.nextLine()));
    }
}
