package ru.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[result.length - 1 - index] = array[index];
        }
        return result;
    }
}