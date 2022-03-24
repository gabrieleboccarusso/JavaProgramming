import java.util.Scanner;
	 
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int sum = 0;
        int input = 1;
        
        while (input != 0) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            sum += input;
        }
        
        System.out.println("Sum of the numbers: "+sum);
    }
}
