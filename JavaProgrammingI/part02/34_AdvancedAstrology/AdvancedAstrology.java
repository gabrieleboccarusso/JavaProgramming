public class AdvancedAstrology {
    public static void printStars(int number) {
        for(int i = 0; i < number; ++i) {
            System.out.print("*");
        }
        System.out.println("");
    }
 
    public static void printTreeStars(int number) {
        for(int i = 0; i < number; ++i) {
            System.out.print("*");
        }
    }
 
    public static void printTriangle(int number) {
        int j = 0;
        int blanks = 0;
        for(int i = 1; i < number+1; ++i) {
            blanks = number-i;
            printSpaces(blanks);
            printStars(i);
        }
    }
 
    public static void printSpaces(int size) {
        for (int i = 0; i < size; ++i) {
            System.out.print(" ");
        }
    }
 
    public static void christmasTree(int height) {
        int j = 0, i = 0;
        int blanks = 0;
        for(i = 1; i < height+1; ++i) {
            blanks = height-i;
            printSpaces(blanks);
            printTreeStars(i);
            printTreeStars(i-1);
            System.out.println("");
        }

        for (i = 0; i < 2; ++i) {
            printSpaces(height-2);
            printTreeStars(3);
            System.out.println("");
        }
    }
	 
    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
