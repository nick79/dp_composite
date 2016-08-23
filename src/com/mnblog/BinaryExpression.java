package com.mnblog;

/**
 * Created by Milan.Nikic on 8/23/2016.
 */
public abstract class BinaryExpression extends UnaryExpression {

    protected Expression left;

    public BinaryExpression(Expression left, Expression right) {
        super(right);
        this.left = left;
    }
}
