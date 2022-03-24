import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String current[], fileName = scanner.nextLine();
        
        try(Scanner fileData = new Scanner(Paths.get(fileName))) {
            while(fileData.hasNextLine()) {
                current = fileData.nextLine().split(",");
                if (!current.equals("")) {
                    System.out.print(current[0] + ", ");
                    System.out.println("age: " + Integer.valueOf(current[1]) + " years");         
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

