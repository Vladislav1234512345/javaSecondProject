package SecondPackage;

public class Complex {
    private double re, im;
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public Complex () {
        this(0.0, 0.0);
    }
    public Complex(int re) {
        this(re, 0.0);
    }
    public Complex (Complex other) {
        this(other.re, other.im);
    }
    public void plus (Complex other) {
        this.re += other.re;
        this.im += other.im;
    }
    public void minus (Complex other) {
        this.re -= other.re;
        this.im -= other.im;
    }
    public void multiply(Complex other) {
        double re = this.re * other.re - this.im * other.im;
        double im = this.re * other.im +  this.im * other.re ;
        this.re = re;
        this.im = im;
    }
    public Boolean compare(Complex other) {
        return (this.re == other.re && this.im == other.im);
    }
    public static Complex plus(Complex c1, Complex c2) {
        return new Complex (c1.re + c2.re, c1.im + c2.im);
    }
    public static Complex minus(Complex c1, Complex c2) {
        return new Complex(c1.re - c2.re, c1.im - c2.im);
    }
    public static Complex multiply(Complex c1, Complex c2) {
        return new Complex (c1.re * c2.re - c1.im * c2.im, c1.re * c2.im + c1.im * c2.re);
    }
    public static boolean compare(Complex c1, Complex c2) {
        return (c1.re == c2.re && c1.im == c2.im);
    }
    public Complex conjugate(Complex other) {
        return new Complex(other.re, other.im * (-1));
    }
    @Override
    public String toString() {
        return "Complex {\t"
                + "re = " + re
                + "\tim = " + im + 'i' + "\t}";
    }
}
