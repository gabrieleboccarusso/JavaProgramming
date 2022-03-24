import java.util.Scanner;
 
public class NameOfTheOldest {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String input = "a";
        int greatest = 0;
        int  age = 0;
        String oldest = " "; 

        while (!input.equals("")) {
            input = scanner.nextLine();
            String[] pieces = input.split(",");
            if (pieces.length > 1) {
                age = Integer.valueOf(pieces[1]);
                if (age > greatest) {
                    greatest = age;
                    oldest = pieces[0];
                }
            }
        }

        System.out.println("Name of the oldest: "+oldest);
    }
}
