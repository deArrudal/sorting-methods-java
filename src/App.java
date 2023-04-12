/*
 * Sort Methods
 * Objective: Given a random int array A, sort its elements using different sort methods.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.01
 */

// Libraries.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int type;
        int[] A = new int[10];
        Random rnd = new Random(); // Create random object.
        Scanner read_input = new Scanner(System.in); // Create a Scanner object.
        String prompt = "1 - Bubble Sort\n2 - Quick Sort\n3 - Merge Sort\n4 - Insertion Sort\nEnter sorting method: ";

        // Input.
        System.out.print(prompt);
        type = read_input.nextInt();
        read_input.close();

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
            case 4:
                // Call merge sort method.
                InsertionSort.method(A);
                break;
        }

        // Display sorted array.
        System.out.println("Output: " + Arrays.toString(A));
    }
}
