public class FromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(2);
    }
    
    public static void printUntilNumber(int number) {
        for(int i = 1; i < number + 1; ++i) {
            System.out.println(i);
        }
    }
}
