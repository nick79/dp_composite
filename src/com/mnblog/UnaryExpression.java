package com.mnblog;

/**
 * Created by Milan.Nikic on 8/23/2016.
 */
public abstract class UnaryExpression implements Expression {
    protected Expression right;

    public UnaryExpression(Expression right) {
        this.right = right;
    }
}
