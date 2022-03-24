import java.util.Scanner;
 
public class FirstWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = "a";

        while (!input.equals("")) {
            input = scanner.nextLine();
            String[] pieces = input.split(" ");
            System.out.println(pieces[0]);
        }
    }
}
