import java.util.Scanner;
	 
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sum = 0;
        double input = 1;
        
        while (input != 0) {
            System.out.println("Give a number:");
            input = Double.valueOf(scanner.nextLine());
            sum += input;
            count++;
        }
        
        count--;
        System.out.println("Average of the numbers: "+Double.valueOf(sum/count));

    }
}
