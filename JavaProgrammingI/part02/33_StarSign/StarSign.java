public class StarSign {
    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }
 
    public static void printStars(int number) {
        for(int i = 0; i < number; ++i) {
            System.out.print("*");
        }
        System.out.println("");
    }
 
    public static void printSquare(int size) {
        int j = 0;
        for(int i = 0; i < size; ++i) {
            for(j = 0; j < size; ++j) {
                System.out.print("*");
            }
            if (i != size-1) {
                System.out.println("");
            }
        }
    }
 
    public static void printRectangle(int width, int height) {
        int j = 0;
        for(int i = 0; i < height; ++i) {
            for(j = 0; j < width; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
 
    public static void printTriangle(int size) {
        int j = 0;
        for(int i = 0; i < size+1; ++i) {
            for(j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
