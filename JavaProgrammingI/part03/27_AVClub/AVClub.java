import java.util.Scanner;
 
public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = "a";

        while (!input.equals("")) {
            input = scanner.nextLine();
            String[] pieces = input.split(" ");

            for (String word : pieces) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
