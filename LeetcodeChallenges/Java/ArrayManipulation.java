import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[] array = { 0, 0, 1, 1, -1, -1, 2, 2, 2, 3 };
        moveNegativesToEnd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void moveNegativesToEnd(int[] arr) {
        int n = arr.length;
        int writeIndex = 0;

        // Move non-negative elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[writeIndex++] = arr[i];
            }
        }

        // Fill remaining positions with -1
        while (writeIndex < n) {
            arr[writeIndex++] = -1;
        }
    }
}