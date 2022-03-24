import java.util.Scanner;
 
public class SquareRootOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int a = Integer.valueOf(scan.nextLine());
        int b = Integer.valueOf(scan.nextLine());
        System.out.println(Math.sqrt(a + b));
    }
}
