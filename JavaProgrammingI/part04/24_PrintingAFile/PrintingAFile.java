import java.nio.file.Paths;
import java.util.Scanner;
	 
public class PrintingAFile {
    public static void main(String[] args) {
        String line = "";
        try(Scanner scan = new Scanner(Paths.get("data.txt"))) {
           while (scan.hasNextLine()) {
                line = scan.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
