package ru.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surname = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages: " + ages.length);
        System.out.println("Размер массива surname: " + surname.length);
        System.out.println("Размер массива prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Maria Ivanova";
        names[2] = "Ivan Maltsev";
        names[3] = "Maria Maltseva";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
