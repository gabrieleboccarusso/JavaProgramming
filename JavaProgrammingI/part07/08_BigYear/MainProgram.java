import java.util.Scanner;

public class mainProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command;
        boolean goOn = true;
        String name, latinName;
        BirdsDB birds = new BirdsDB();
        
        while(goOn) {
            System.out.println("? ");
            command = scan.nextLine();
            
            switch(command) {
                default:
                    System.out.println("Unknown input");
                    break;
                case "Quit":
                    goOn = false;
                    break;
                case "Add":
                    System.out.println("Name:");
                    name = scan.nextLine();
                    System.out.println("Name in Latin:");
                    latinName = scan.nextLine();
                    birds.add(name, latinName);
                    break;
                case "Observation":
                    System.out.println("Bird? ");
                    birds.addObservationTo(scan.nextLine());
                    break;
                case "All":
                    birds.printAll();
                    break;
                case "One":
                    System.out.println("Bird?");
                    birds.printOne(scan.nextLine());
                    break;
            }
        }
    }
}
