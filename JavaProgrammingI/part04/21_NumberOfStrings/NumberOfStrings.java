import java.util.Scanner;
 
public class NumberOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        boolean goOn = true;
        String input;
        int count = 0;
        
        while(goOn) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                goOn = false;
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}
