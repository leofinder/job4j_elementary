package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean reference = data[0];
        for (boolean item : data) {
            if (item != reference) {
                return false;
            }
        }
        return true;
    }
}
