/*
 * BubbleSort
 * Objective: Implement a Bubble sort routine.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.0
 */

public class BubbleSort {
    public static void method(int[] array) {
        boolean flag_end; // Flag end of sort procedure.
        int swap;
        int size = array.length;

        do {
            flag_end = true; // Reset.

            for (int i = 1; i <= (size - 1); i++) {
                if (array[i - 1] > array[i]) {
                    // Swap elements.
                    swap = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = swap;

                    flag_end = false;
                }
            }

            size--; // Decrease loop's upper limit.

        } while (!flag_end);
    }
}
