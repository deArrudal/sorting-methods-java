/*
 * MergeSort
 * Objective: Implement a Merge sort routine.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.01
 */

public class MergeSort {
    public static void method(int[] array) {
        int size = array.length;
        int i;

        // Recursion return condition.
        if (size <= 1) {
            return;
        }

        // Slipt array in two.
        int mid_index = size / 2;
        int[] left_half = new int[mid_index];
        int[] right_half = new int[size - mid_index];

        for (i = 0; i < mid_index; i++) {
            left_half[i] = array[i];
        }
        for (i = mid_index; i < size; i++) {
            right_half[i - mid_index] = array[i];
        }

        // Recursive call.
        method(left_half);
        method(right_half);

        // Merge arrays.
        merge(array, left_half, right_half);
    }

    // Merge arrays.
    static void merge(int[] array, int[] left_half, int[] right_half) {
        int left_size = left_half.length;
        int right_size = right_half.length;
        int i = 0;
        int j = 0;
        int k = 0;

        // Run until one array becames empty.
        while ((i < left_size) && (j < right_size)) {
            if (left_half[i] < right_half[j]) {
                array[k] = left_half[i];
                i++;
            } else {
                array[k] = right_half[j];
                j++;
            }
            k++;
        }
        // Empty remaining array.
        while (i < left_size) {
            array[k] = left_half[i];
            i++;
            k++;
        }
        while (j < right_size) {
            array[k] = right_half[j];
            j++;
            k++;
        }
    }
}
