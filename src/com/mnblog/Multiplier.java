package com.mnblog;

/**
 * Created by Milan.Nikic on 8/23/2016.
 */
public class Multiplier extends BinaryExpression {

    public Multiplier(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double calculate() {
        return left.calculate() * right.calculate();
    }
}
