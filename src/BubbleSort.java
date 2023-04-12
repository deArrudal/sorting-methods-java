/*
 * BubbleSort
 * Objective: Implement a Bubble sort routine.
 * Implemented by Lucas deArruda
 * Created in 11/04/2023
 * v1.01
 */

public class BubbleSort {
    public static void method(int[] array) {
        boolean flag_end; // Flag end of sort procedure.
        int size = array.length;
        int swap;

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
