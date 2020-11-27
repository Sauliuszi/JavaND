package nd8;

public class Kvadratas extends Figura {
    private double n;

    public Kvadratas(double x, double y, double pasukimas, double n) {
        super(x, y, pasukimas);
        this.n = n;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    @Override
    public double plotas() {
        return n * n;
    }

    @Override
    public double perimetras() {
        return n * 4;
    }
}
