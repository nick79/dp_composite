package com.mnblog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Milan.Nikic on 8/23/2016.
 */
public class CompositeTest {

    @Test
    public void testConstant() {
        Expression e = new Constant(1.0);
        assertEquals(1, e.calculate(), 0.0);
    }

    @Test
    public void testNegate() {
        Expression e = new Negate(new Constant(- 1.0));
        assertEquals(1, e.calculate(), 0.0);
    }

    @Test
    public void testAdder() {
        Expression e = new Adder(new Constant(1.0), new Constant(2.0));
        assertEquals(3, e.calculate(), 0.0);
    }

    @Test
    public void testSubtracter() {
        Expression e = new Subtracter(new Constant(1.0), new Constant(2.0));
        assertEquals(-1, e.calculate(), 0.0);
    }

    @Test
    public void testMultiplier() {
        Expression e = new Multiplier(new Constant(5.0), new Constant(2.0));
        assertEquals(10, e.calculate(), 0.0);
    }

    @Test
    public void testDivider() {
        Expression e = new Divider(new Constant(5.0), new Constant(2.0));
        assertEquals(2.5, e.calculate(), 0.0);
    }

    @Test
    public void testComplex() {
        Expression e =
                new Divider(
                        new Multiplier(
                                new Negate(new Constant(5.0)),
                                new Divider(new Constant(9.0), new Constant(6.0))
                        ),
                        new Adder(
                                new Constant(7.0),
                                new Subtracter(new Constant(2.0), new Constant(1.5))
                        )
                );
        assertEquals(-1, e.calculate(), 0.0);
    }
}
