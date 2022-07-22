package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to31then2dot82() {
        double expected = 2.82;
        Point a = new Point(1, 3);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when50to61then1dot41() {
        double expected = 1.41;
        Point a = new Point(5, 0);
        Point b = new Point(6, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}