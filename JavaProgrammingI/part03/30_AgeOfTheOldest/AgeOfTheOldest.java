import java.util.Scanner;
 
public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = "a";
        int greatest = 0;
        int  age = 0;

        while (!input.equals("")) {
            input = scanner.nextLine();
            String[] pieces = input.split(",");
            if (pieces.length > 1) {
                age = Integer.valueOf(pieces[1]);
                if (age > greatest) {
                    greatest = age;
                }
            }
        }

        System.out.println("Age of the oldest: "+greatest);
    }
}
