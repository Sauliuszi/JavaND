package n16;

import java.util.Objects;

public class Darbuotojai {
    private String vardas;

    public Darbuotojai(String vardas) {
        this.vardas = vardas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    @Override
    public String toString() {
        return "Darbuotojo " +
                "vardas: " + vardas + " uzdirbo"
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Darbuotojai that = (Darbuotojai) o;
        return Objects.equals(vardas, that.vardas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vardas);
    }
}
