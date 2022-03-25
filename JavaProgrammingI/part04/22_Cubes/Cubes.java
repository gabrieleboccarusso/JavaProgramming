import java.util.Scanner;
 
public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean goOn = true;
        String input;
        int num;
        
        while(goOn) {
            input = scanner.nextLine();
            if(input.equals("end")) {
                goOn = false;
            } else {
                num = Integer.valueOf(input);
                num = num*num*num;
                System.out.println(num);
            }
        }
    }
}
