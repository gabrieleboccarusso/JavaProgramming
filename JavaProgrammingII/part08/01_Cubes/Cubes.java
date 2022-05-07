import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int value;
        boolean goOn = true;
        
        while(goOn) {
            input = scanner.nextLine();
            
            if (input.equals("end")) {
                goOn = false;
            } else {
                value = Integer.valueOf(input);
                System.out.println(value * value * value); 
            };
        }
    }
}
