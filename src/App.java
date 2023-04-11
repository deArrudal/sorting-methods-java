/*
 * Sort Methods
 * Objective: Given a random int array A, sort its elements using different sort methods.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.0
 */

// Libraries.
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rnd = new Random(); // Create random object.
        int[] A = new int[10];
        int type = 3;

        // Fill the array with random values.
        for (int i = 0; i < A.length; i++) {
            A[i] = rnd.nextInt(100);
        }

        // Display unsorted array.
        System.out.println("Input: " + Arrays.toString(A));

        // Sort array.
        switch (type) {
            case 1:
                // Call bubble sort method.
                BubbleSort.method(A);
                break;
            case 2:
                // Call quick sort method.
                QuickSort.method(A, 0, (A.length - 1));
                break;
            case 3:
                // Call merge sort method.
                MergeSort.method(A);
                break;
        }

        // Display sorted array.
        System.out.println("Output: " + Arrays.toString(A));
    }
}
