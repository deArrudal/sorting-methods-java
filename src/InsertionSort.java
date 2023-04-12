/*
 * InsertSort
 * Objective: Implement a Insert sort routine.
 * Implemented by Lucas deArruda
 * Created in 12/04/2023
 * v1.0
 */

public class InsertionSort {
    public static void method(int[] array) {
        int size = array.length;
        int aux;
        int j;

        for (int i = 1; i < size; i++) {
            aux = array[i]; // Set temporary value.
            j = i - 1; // Index run between 0 and (i-1) comparing value with aux.

            while ((j >= 0) && (array[j] > aux)) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = aux;
        }
    }
}
