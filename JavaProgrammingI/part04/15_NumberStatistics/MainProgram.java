import java.util.Scanner;
	 
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
        boolean goOn = true;
        int input = 0;
        
        while (goOn) {
            System.out.println("Enter numbers:");
            input = Integer.valueOf(scanner.nextLine());
            if (input != -1) {
                statistics.addNumber(input);
                if (input % 2 == 0) {
                    statisticsEven.addNumber(input);
                } else {
                    statisticsOdd.addNumber(input);
                }
            } else {
                goOn = false;
            }
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
    }
}
