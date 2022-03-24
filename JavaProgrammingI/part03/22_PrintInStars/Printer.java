public class Printer {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
 
    public static void printArrayInStars(int[] array) {
        int i, j;
        for(i = 0; i < array.length; ++i) {
            for (j = 0; j < array[i]; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
