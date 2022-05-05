import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean goOn = true;
        int value, total = 0, iterations = 0;
        int totalPassing = 0, iterationsPassing = 0;
        String[] stars = {"", "", "", "", "", ""};
        
        System.out.println("Enter point totals, -1 stops:");
        while(goOn) {
            value = Integer.valueOf(scanner.nextLine());
            
            if (value == -1) {
                goOn = false;
            } else {
                if (value >= 0 && value <= 100) {
                    iterations++;
                    total += value;
                    
                    if (value >= 50) {
                        iterationsPassing++;
                        totalPassing += value;
                    }
                    
                    if (value < 50) {
                        stars[0] += "*";
                    } else if (value < 60) {
                        stars[1] += "*";
                    } else if (value < 70) {
                        stars[2] += "*";
                    } else if (value < 80) {
                        stars[3] += "*";
                    } else if (value < 90) {
                        stars[4] += "*";
                    } else {
                        stars[5] += "*";
                    }
                }
            }
        }
        double avg = 1.0 * total / iterations;
        double avgPass = 1.0 * totalPassing / iterationsPassing;
        double passing = 1.0 * 100 * iterationsPassing / iterations;
        System.out.println("Point average (all): " + avg);
        System.out.println("Point average (passing): " + avgPass);
        System.out.println("Pass percentage: " + passing);
        System.out.println("Grade distribution:");
        System.out.println("5: " + stars[5]);
        System.out.println("4: " + stars[4]);
        System.out.println("3: " + stars[3]);
        System.out.println("2: " + stars[2]);
        System.out.println("1: " + stars[1]);
        System.out.println("0: " + stars[0]);
    }
}
