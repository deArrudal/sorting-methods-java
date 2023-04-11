/*
 * MergeSort
 * Objective: Implement a Merge sort routine.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.0
 */

public class MergeSort {
    public static void method(int[] array) {
        int size = array.length;

        // Recursion return condition.
        if (size <= 1) {
            return;
        }

        // Slipt array in two.
        int midIndex = size / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[size - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = midIndex; i < size; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        // Recursive call.
        method(leftHalf);
        method(rightHalf);

        // Merge arrays.
        merge(array, leftHalf, rightHalf);
    }

    // Merge arrays.
    static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftsize = leftHalf.length;
        int rightsize = rightHalf.length;
        int i = 0, j = 0, k = 0;

        // Run until one array becames empty.
        while ((i < leftsize) && (j < rightsize)) {
            if (leftHalf[i] < rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        // Empty remaining array.
        while (i < leftsize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightsize) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
