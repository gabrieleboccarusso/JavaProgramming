import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalInformationCollection {
    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean goOn = true;
        String name, lastName, id;
        
        while(goOn){
            System.out.println("First name:");
            name = scanner.nextLine();
            if (name.equals("")) {
                goOn = false;
            } else {
                System.out.println("Last name:");
                lastName = scanner.nextLine();
                
                System.out.println("Identification number:");
                id = scanner.nextLine();
                
                infoCollection.add(new PersonalInformation(name, lastName, id));
            }
        }
        
        for (PersonalInformation current : infoCollection) {
            System.out.println(current.getFirstName() + " " + current.getLastName());
        }
    }
}
