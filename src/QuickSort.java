/*
 * QuickSort
 * Objective: Implement a Quick sort routine.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.01
 */

public class QuickSort {
    public static void method(int[] array, int low, int high) {
        if (low < high) {
            int index = partition(array, low, high);
            method(array, low, (index - 1));
            method(array, (index + 1), high);
        }
    }

    // Slipt array into two partitions.
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot.
        int i = low - 1; // Temporary pivot index.
        int swap;

        for (int j = low; j <= (high - 1); j++) {
            if (array[j] <= pivot) {
                i++; // Move pivot.

                // Swap elements.
                swap = array[j];
                array[j] = array[i];
                array[i] = swap;
            }
        }

        // Move the pivot element to the correct pivot position.
        i++;
        swap = array[high];
        array[high] = array[i];
        array[i] = swap;

        return i;
    }
}
