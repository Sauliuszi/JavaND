package nd9Interface;

import java.time.LocalDateTime;

public class MokejimoIstorija {

    private LocalDateTime data;
    private String bankoSaskaita;
    private double suma;

    public MokejimoIstorija(LocalDateTime data, String bankoSaskaita, double suma) {
        this.data = data;
        this.bankoSaskaita = bankoSaskaita;
        this.suma = suma;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getBankoSaskaita() {
        return bankoSaskaita;
    }

    public void setBankoSaskaita(String bankoSaskaita) {
        this.bankoSaskaita = bankoSaskaita;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
}
