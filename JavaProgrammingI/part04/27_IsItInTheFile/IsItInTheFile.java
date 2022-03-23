import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;
 
public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
 
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        ArrayList list = new ArrayList<>();
 
        try(Scanner dataFile = new Scanner(Paths.get(file))) {
            while(dataFile.hasNextLine()) {
                list.add(dataFile.nextLine());
            }
            
            // still better than using continue and break
           if (list.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + e.getMessage() + " failed.");
        }
    }
}
