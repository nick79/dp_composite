package com.mnblog;

/**
 * Created by Milan.Nikic on 8/23/2016.
 */
public class Constant implements Expression {

    double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return value;
    }
}
