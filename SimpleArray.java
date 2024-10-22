import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) throws Exception {
        int[] arr = {45, 31, 77, 2, 43, 98, 6, 14};
        int min = minElement(arr);
        int max = maxElement(arr);

        System.out.print("Original array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.println("The smallest element in the array is " + min + ".");
        System.out.println("The largest element in the array is " + max + ".");
    }

    public static int minElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
