package n16;


import java.util.Objects;

public class Mokejimai {

    private Darbuotojai darbuotojai;
    private Double mokejimas;

    public Mokejimai(Darbuotojai darbuotojai, Double mokejimas) {
        this.darbuotojai = darbuotojai;
        this.mokejimas = mokejimas;
    }

    public Darbuotojai getDarbuotojai() {
        return darbuotojai;
    }

    public void setDarbuotojai(Darbuotojai darbuotojai) {
        this.darbuotojai = darbuotojai;
    }

    public Double getMokejimas() {
        return mokejimas;
    }

    public void setMokejimas(Double mokejimas) {
        this.mokejimas = mokejimas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mokejimai mokejimai = (Mokejimai) o;
        return Objects.equals(darbuotojai, mokejimai.darbuotojai) &&
                Objects.equals(mokejimas, mokejimai.mokejimas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(darbuotojai, mokejimas);
    }

    @Override
    public String toString() {
        return "Mokejimai: " +
                "darbuotojas " + darbuotojai +
                ", mokejimas: " + mokejimas + " ";
    }

}

