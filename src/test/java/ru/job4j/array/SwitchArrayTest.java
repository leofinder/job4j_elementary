package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to5() {
        int[] input = {7, 222, 3, -4, 7, 12, 0};
        int source = 4;
        int dest = 5;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 222, 3, -4, 12, 7, 0};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to3() {
        int[] input = {7, 222, 3, -4, 7, 12, 0};
        int source = 3;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {7, 222, 3, -4, 7, 12, 0};
        Assert.assertArrayEquals(expected, result);
    }
}