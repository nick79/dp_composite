package com.mnblog;

/**
 * Created by Milan.Nikic on 8/23/2016.
 */
public class Negate extends UnaryExpression {

    public Negate(Expression right) {
        super(right);
    }

    @Override
    public double calculate() {
        return -right.calculate();
    }
}
