import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean goOn = true;
        int iterations = 0, total = 0, current;
        String input;
        
        while (goOn) {
            input = scanner.nextLine();
            current = Integer.valueOf(input);
            
            if (current > 0) {
                iterations++;
                total += current;
            } else if (current == 0) {
                goOn = false;
            }
        }
        
        if (iterations == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(1.0 * total / iterations);
        }
    }
}
