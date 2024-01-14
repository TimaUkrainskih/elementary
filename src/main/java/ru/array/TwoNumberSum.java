package ru.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i <= array.length / 2) {
            if (array[i] + array[j] == target) {
                return new int[]{i, j};
            }
            if (array[i] == 0) {
                i++;
            }
            if (array[j] == 0) {
                j--;
            }
            i++;
            j--;
        }
        return new int[0];
    }
}