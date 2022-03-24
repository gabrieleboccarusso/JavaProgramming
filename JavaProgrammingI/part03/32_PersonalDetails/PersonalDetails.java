import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = "a";
        String longest = "";
        int sum = 0;
        int count = 0;

        while (!input.equals("")) {
            input = scanner.nextLine();
            String[] pieces = input.split(",");
            if (pieces.length > 1) {
                sum += Integer.valueOf(pieces[1]);
                count++;
                if (longest.length() < pieces[0].length()) {
                    longest = pieces[0];
                }
            }
        }

        double avg = 1.0 * sum/count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth yearst: " + avg);
    }
}
