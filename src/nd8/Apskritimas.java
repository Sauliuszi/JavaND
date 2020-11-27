package nd8;

public class Apskritimas extends Figura {
    private double r;

    public Apskritimas(double x, double y, double pasukimas, double r) {
        super(x, y, pasukimas);
        this.r = r;
    }

    @Override
    public double plotas() {
        return Math.PI * r * r;
    }

    @Override
    public double perimetras() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
