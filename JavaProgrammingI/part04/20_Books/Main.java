import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean goOn = true;
        String title, kindInfo;
        int pages, year;
        
        while (goOn) {
            System.out.println("Title:");
            title = scanner.nextLine();
            
            if (title.equals("")) {
                goOn = false;
            } else {
                System.out.println("Pages:");
                pages = Integer.valueOf(scanner.nextLine());
                System.out.println("Publication year:");
                year = Integer.valueOf(scanner.nextLine());
                
                bookList.add(new Book(title, pages, year));
            }
        }
        
        System.out.println("What information will be printed?");
        kindInfo = scanner.nextLine();
        
        switch (kindInfo) {
            case "everything":
                for(Book book : bookList) {
                    System.out.println(book);
                }
                break;
            case "name":
                for(Book book : bookList) {
                    System.out.println(book.getTitle());
                }
                break;
        }
    }
}
