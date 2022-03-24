import java.util.Scanner;
 
public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Where to?");
        int to = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from?");
        int from = Integer.valueOf(scanner.nextLine());
        
        if (to >= from) {
            for (int i = from; i < to+1; i++){
                System.out.println(i);
            }
        }
    }
}
