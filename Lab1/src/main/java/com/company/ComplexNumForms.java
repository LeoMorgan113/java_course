package com.company;

public class ComplexNumForms extends ComplexNum implements Complex{
    public enum FORMAT {STANDARD, EXPONENTIAL};
    public static final int standard_view = 0; //x+yi
    public static final int exp_view = 1; //R.cis(theta), where theta is arg(z)
    private String simple = "x+iy";
    private String exponential = "r.cis(theta)";

    public ComplexNumForms() {
        super();
    }

    public ComplexNumForms(double real, double imaginary) {
        super(real, imaginary);
    }

    public void setNum(ComplexNum z) {
        setNum(z);
    }

    @Override
    @Show
    public String toString() {
        String re = this.real+"";
        String im = "";
        if(this.imaginary < 0)
            im = this.imaginary+"i";
        else
            im = "+"+this.imaginary+"i";
        return re+im;
    }

    public double mod() {
        return Math.sqrt(Math.pow(this.real,2) + Math.pow(this.imaginary,2));
    }

    public double addReal(ComplexNum b){
        ComplexNum a = this;
        double real = a.real + b.real;
        return real;
    }

    public double addImaginary(ComplexNum b){
        ComplexNum a = this;
        double imaginary = a.imaginary + b.imaginary;
        return imaginary;
    }

    @Show
    public double getArg() {
        return Math.atan2(imaginary,real);
    }

    @Show
    public String exp() {
        String exp = "";
        exp = (double) Math.round(mod() * 100) / 100 +
                " cis(" + (double) Math.round(getArg() * 100) / 100 + ")";
        return exp;
    }

    public String format(FORMAT t){
        String out = "";
        if(t == FORMAT.STANDARD) {
            out = simple + " = " + toString();
        }
        else if(t == FORMAT.EXPONENTIAL) {
            out = exponential + " = " + exp();
        }
        else {
            out = "Unknown Complex Number format.";
        }
        return out;
    }

}
