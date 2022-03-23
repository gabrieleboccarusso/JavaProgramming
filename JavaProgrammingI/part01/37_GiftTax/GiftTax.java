import java.util.Scanner;
 
public class GiftTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        int lowerLimit = 0;
        int end = 0;
        double taxRate = 0.0;
        double finalTax = 0.0;
        
        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value >= 5000 && value <= 25000) {
            lowerLimit = 100;
            end = 5000;
            taxRate = 0.08;
            finalTax = lowerLimit + (value - end) * taxRate;    
            System.out.println("Tax: "+finalTax);
        } else if (value >= 25000 && value <= 55000) {
            lowerLimit = 1700;
            end = 25000;
            taxRate = 0.1;
            finalTax = lowerLimit + (value - end) * taxRate;    
            System.out.println("Tax: "+finalTax);
        } else if (value >= 55000 && value <= 200000){
            end = 55000;
            lowerLimit = 4700;
            taxRate = 0.12;
            finalTax = lowerLimit + (value - end) * taxRate;    
            System.out.println("Tax: "+finalTax);
        } else if (value >= 200000 && value <= 1000000) {
            end = 200000;
            lowerLimit = 22100;
            taxRate = 0.15;
            finalTax = lowerLimit + (value - end) * taxRate;    
            System.out.println("Tax: "+finalTax);
        } else if (value >= 1000000) {
            end = 1000000;
            lowerLimit = 142100;
            taxRate = 0.17;
            finalTax = lowerLimit + (value - end) * taxRate;    
            System.out.println("Tax: "+finalTax);
        }
    }
}
