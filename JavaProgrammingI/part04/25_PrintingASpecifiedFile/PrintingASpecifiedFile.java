import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingASpecifiedFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "", line = "";
        System.out.println("Which file should have its contents printed?");
        input = scanner.nextLine();
        
        try(Scanner fileScan = new Scanner(Paths.get(input))) {
            while (fileScan.hasNextLine()) {
                line = fileScan.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
