package nd8;

public abstract class Figura {
private double x;
private double y;
private double pasukimas;

    public Figura(double x, double y, double pasukimas) {
        this.x = x;
        this.y = y;
        this.pasukimas = pasukimas;
    }

    public abstract double plotas();

    public abstract double perimetras();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPasukimas() {
        return pasukimas;
    }

    public void setPasukimas(double pasukimas) {
        this.pasukimas = pasukimas;
    }
}
