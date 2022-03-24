import java.util.ArrayList;
import java.util.Scanner;
 
public class AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int input = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (input != -1) {
            input = Integer.valueOf(scanner.nextLine());
            list.add(input);
        }
 
        list.remove(list.size()-1);
        int sum = 0;
        for (int num : list) {
            sum = sum + num;
        }

        double avg = 1.0 * sum/list.size();
        System.out.println("Average: "+avg);
    }
}
