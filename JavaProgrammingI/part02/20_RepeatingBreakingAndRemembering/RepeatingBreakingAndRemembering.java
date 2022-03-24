import java.util.Scanner;
	 
public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
	             
        Scanner scan = new Scanner(System.in);
        System.out.println("Give numbers:");
        int current = 0;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        
        while (current != -1) {
            sum = sum + current;
            count++;
            current = Integer.valueOf(scan.nextLine());
            if (current % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        count--;
        double avg = 1.0 * sum/count;
        odd--;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+count);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
