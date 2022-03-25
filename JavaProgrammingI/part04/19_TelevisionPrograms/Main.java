import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean goOn = true;
        String name;
        int duration, maxDuration;
        
        while (goOn) {
            System.out.println("Name:");
            name = scanner.nextLine();
            if (name.equals("")) {
                goOn = false;
            } else {
                System.out.println("Duration:");
                duration = Integer.valueOf(scanner.nextLine());
                
                programs.add(new TelevisionProgram(name, duration));
            }
        }
        
        System.out.println("Program's maximum duration?");
        maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram current : programs) {
            if (current.getDuration() <= maxDuration) {
                System.out.println(current);
            }
        }
    }
}
