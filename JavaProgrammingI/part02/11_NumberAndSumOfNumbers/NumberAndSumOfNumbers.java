import java.util.Scanner;
 
public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int input = 1;
        
        while (input != 0) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            sum += input;
            count++;
        }
        
        count--;
        System.out.println("Number of numbers: "+count);
        System.out.println("Sum of the numbers: "+sum);
    }
}
