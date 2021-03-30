package com.leo.testEngland;

import java.util.Arrays;
import java.util.Comparator;

public class Complex implements Comparable<Complex> {
    private final double x;
    private final double y;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double re() {
        return x;
    }

    public double im() {
        return y;
    }

    public Complex conjugate() {
        return new Complex(x, -y);
    }

    public Complex sum(Complex other) {
        return new Complex(other.getX() + other.getY(), other.getX() + other.getY());
    }

    public Complex product(Complex other) {
        return new Complex(
                other.getX() * other.getY() - other.getX() * other.getY(),
                other.getX() * other.getY() + other.getX() * other.getY());
    }

    public Complex distance(Complex other) {
        return new Complex(other.getX() - other.getY(),other.getX() - other.getY());
    }

    public int compareTo(Complex other) {
        if (this == other) return 1;
        if (other == null || getClass() != other.getClass()) return 0;

        Complex complex = (Complex) other;

        if (Double.compare(complex.getX(), getX()) != 0) return 0;
        return 0;
    }

    public String toString() {
        if (y == 0) return x + "";
        if (x == 0) return y + "i";
        if (y <  0) return x + " - " + (-y) + "i";
        return x + " + " + y + "i";
    }

    public static class ImOrder implements Comparator<Complex> {
        public int compare(Complex u, Complex v) {
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Complex a [] = new Complex[1000];
        //not enough time for this but after managing this task we will sort
        Arrays.sort(a);

    }
}
