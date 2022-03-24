import java.util.Scanner;
 
public class NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = -1;
        int input = 1;
        
        while (input != 0) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            count++;
        }
        
        System.out.println("Number of numbers: "+count);
    }
}
