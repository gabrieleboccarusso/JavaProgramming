import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList items = new ArrayList<Item>();
        
        String identifier;
        String name;
        boolean goOn = true;
        
        while(goOn) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scan.nextLine();
            if (identifier.equals("")) {
                goOn = false;
            } else {
                System.out.println("Name? (empty will stop)");
                name = scan.nextLine();
                if (!(name.equals(""))) {
                   items.add(new Item(identifier, name));
                } else {
                    goOn = false;
                }
            }
        }
        
        ArrayList unique = new ArrayList<Item>();
        
        System.out.println("==Items==");
        for (Object item : items) {
            if(!(unique.contains(item))) {
                System.out.println(item); 
                unique.add(item);
            }
        }
    }
}
