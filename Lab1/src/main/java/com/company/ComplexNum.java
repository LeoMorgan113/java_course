package com.company;

public class ComplexNum{
    public double real;
    public double imaginary;

    public ComplexNum() {
        real = 0.0;
        imaginary = 0.0;
    }

    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void set(ComplexNum z) {
        this.real = z.real;
        this.imaginary = z.imaginary;
    }

    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }
}
