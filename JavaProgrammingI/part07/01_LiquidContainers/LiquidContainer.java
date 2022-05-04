import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goOn = true;
        String input;
        int value;
        String[] parts;
        Container first = new Container(), second = new Container();
        
        while (goOn) {
            System.out.println("First " + first.getAmount() + "/100");
            System.out.println("Second " + second.getAmount() + "/100");
            System.out.print("> ");

            input = scan.nextLine();
            
            parts = input.split(" ");
            value = (parts.length > 1) ? Integer.valueOf(parts[1]) : 0;
            switch(parts[0]) {
                case "add":
                    first.add(value);
                    break;
                case "move": 
                    first.move(value, second);
                    break;
                case "remove":
                    second.remove(value);
                    break;
                case "quit":
                    goOn = false;
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
}
