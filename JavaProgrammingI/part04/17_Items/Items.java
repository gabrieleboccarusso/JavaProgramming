import java.util.ArrayList;
import java.util.Scanner;
 
public class Items {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String input;
        boolean goOn = true;
        
        while(goOn) {
            input = scanner.nextLine();
            if (input.equals("")) {
                goOn = false;
            } else {
                items.add(new Item(input));
            }
        }
        
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
