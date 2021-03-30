package com.leo.testEngland;

public class Complex2 implements Comparable<Complex2>{

    private double real;
    private double imagine;

    public Complex2(){}

    /**
     * @param real The real part of a complex number
     * @param imagine The imaginary part of a complex number
     * */
    public Complex2(double real, double imagine){
        this.real = real;
        this.imagine = imagine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Complex2 complex = (Complex2) o;

        if (Double.compare(complex.getReal(), getReal()) != 0) return false;
        return Double.compare(complex.getImagine(), getImagine()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getReal());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getImagine());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "(" + real + ", " + imagine + ')';
    }

    @Override
    public int compareTo(Complex2 complex) {
        return (int) (modulo() - complex.modulo());
    }


    /* Object methods */

    /**
     * @return Modulus of complex number (double)
     * */
    public synchronized double modulo(){
        return Math.sqrt(real*real + imagine*imagine);
    }

    /**
     * Adding a complex number
     * @param number Additive complex number
     * */
    public synchronized void add(Complex2 number){
        this.real = this.real + number.getReal();
        this.imagine = this.imagine + number.getImagine();
    }

    /**
     * Subtraction of a complex number
     * @param number Subtracted complex number
     * */
    public synchronized void sub(Complex2 number){
        this.real = this.real - number.getReal();
        this.imagine = this.imagine - number.getImagine();
    }

    /**
     * Multiplication of a complex number
     * @param number multiplier
     * */
    public synchronized void mul(Complex2 number){
        double re = this.real;
        double im = this.imagine;

        this.real = re * number.getReal() - im * number.getImagine();
        this.imagine = re * number.getImagine() + im * number.getReal();
    }


    /* Static methods */

    /**
     *  The sum of complex numbers
     *  @param num First term
     *  @param num2 Second term
     *  @return Result of addition
     * */
    public synchronized static Complex2 sum(Complex2 num, Complex2 num2){
        return new Complex2(num.getReal() + num2.getReal(), num.getImagine() + num2.getImagine());
    }

    /**
     *  Difference of complex numbers
     *  @param num Minuend
     *  @param num2 Subtrahend
     *  @return Result of difference
     * */
    public synchronized static Complex2 difference(Complex2 num, Complex2 num2){
        return new Complex2(num.getReal() - num2.getReal(), num.getImagine() - num2.getImagine());
    }

    /**
     *  The product of complex numbers
     *  @param num First factor
     *  @param num2 Second factor
     *  @return Multiplication result
     * */
    public synchronized static Complex2 product(Complex2 num, Complex2 num2){
        return new Complex2(
                num.getReal() * num2.getReal() - num.getImagine() * num2.getImagine(),
                num.getReal() * num2.getImagine() + num.getImagine() * num2.getReal());
    }


    /* Getters and setters */

    public synchronized double getReal() {
        return real;
    }

    public synchronized void setReal(double real) {
        this.real = real;
    }

    public synchronized double getImagine() {
        return imagine;
    }

    public synchronized void setImagine(double imagine) {
        this.imagine = imagine;
    }

}
