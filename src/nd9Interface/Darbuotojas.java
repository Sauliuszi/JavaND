package nd9Interface;

public class Darbuotojas implements IMokejimas {
    private String vardas;
    private String pavarde;
    private String bankoSaskaita;
    private double suma;

    @Override
    public String getBankoSakaitosNr() {
        return bankoSaskaita;
    }

    @Override
    public String getSaskaitosSavininkas() {
        return vardas + " " + pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getBankoSaskaita() {
        return bankoSaskaita;
    }

    public void setBankoSaskaita(String bankoSaskaita) {
        this.bankoSaskaita = bankoSaskaita;
    }

    @Override
    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
}
