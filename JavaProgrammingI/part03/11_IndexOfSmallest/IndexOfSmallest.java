import java.util.ArrayList;
import java.util.Scanner;
 
public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<Integer> list = new ArrayList<>();
        int input = 0;
        while (input != 9999) {
            input = Integer.valueOf(scanner.nextLine());
            list.add(input);
        } 
        
        list.remove(list.size()-1);
        
        int smallest = list.get(0);
        int indexSmallest = 0;
        
        for(int i = 1; i < list.size(); ++i) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
                indexSmallest = i;
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + indexSmallest);
    }
}
