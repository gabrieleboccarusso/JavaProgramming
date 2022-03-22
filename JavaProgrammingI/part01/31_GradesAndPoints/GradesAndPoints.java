import java.util.Scanner;
 
public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number = Integer.valueOf(scan.nextLine());
        
        String result = "";
        
        if (number < 0) {
            result = "impossible!";
        } else if (number <= 49) {
            result = "failed";
        } else if (number <= 59) {
            result = "1";
        } else if (number <= 69) {
           result = "2";
        } else if (number <= 79) {
            result = "3";
        } else if (number <= 89) {
            result = "4";
        } else if (number <= 100) {
            result = "5";
        } else {
            result = "incredible!";
        }
 
        System.out.println("Grade: " + result);
    }
}
