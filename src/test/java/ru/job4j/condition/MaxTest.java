package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax5To1Then5() {
        int first = 5;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To3Then3() {
        int first = 3;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1And2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax4And3And2To1Then4() {
        int first = 4;
        int second = 3;
        int third = 2;
        int fourth = 1;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}