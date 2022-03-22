import java.util.Scanner;
 
public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int num = Integer.valueOf(scan.nextLine());
        
        System.out.print("Number " + num);
        if (num % 2 == 0) {
            System.out.print(" is even.");
        } else {
            System.out.print(" is odd.");
        }
    }
}
