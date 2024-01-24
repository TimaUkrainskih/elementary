package ru.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int a, int b, int c) {
        if (a > max(b, c)) {
            return a;
        } else {
            return max(b, c);
        }

    }

    public static int max(int a, int b, int c, int d) {
        if (a > max(b, c, d)) {
            return a;
        } else {
            return max(b, c, d);
        }
    }
}
