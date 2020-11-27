package nd8;

public class Trikampis extends Figura{
    double a;
    double b;
    double c;

    public Trikampis(double x, double y, double pasukimas, double a, double b, double c) {
        super(x, y, pasukimas);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double plotas() {
        return Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
    }

    @Override
    public double perimetras() {
        return a + b + c;
    }
}
