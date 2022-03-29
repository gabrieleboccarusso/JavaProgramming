import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        boolean goOn = true;
        while (goOn) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                goOn = false;
            } else {
                System.out.println("Publication year:");
                int publicationYear = Integer.valueOf(scanner.nextLine());
                Book book = new Book(name, publicationYear);
                if (!books.contains(book)) {
                    books.add(book);
                } else {
                    System.out.println("The book is already on the list. Let's not add the same book again.");
                }          
            }
        }
        
        System.out.println("Thank you! Books added: " + books.size());
    }
}

