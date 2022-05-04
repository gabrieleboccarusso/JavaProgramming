import java.util.Arrays;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] <= smallest) { smallest = arr[i]; }
        }
        
        return smallest;
    } 
    
    public static int indexOfSmallest(int[] arr) {
        int smallest = arr[0], index = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] <= smallest) { 
                smallest = arr[i]; 
                index = i; 
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] arr, int value) {
        int smallest = arr[value], index = value;
        for (int i = value; i < arr.length; ++i) {
            if (arr[i] <= smallest) { 
                smallest = arr[i]; 
                index = i; 
            }
        }
        
        return index;
    }
    
    public static void swap(int[] arr, int a, int b) {
        int swap = arr[b];
        arr[b] = arr[a];
        arr[a] = swap;
    }
    
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            swap(arr, i, indexOfSmallestFrom(arr, i));
            System.out.println(Arrays.toString(arr));
        }
    }
}
