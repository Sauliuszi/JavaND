package nd9Interface;

public class Klientas implements IMokejimas{
    private String pavadinimas;
    private String imonesKodas;
    private String bankoSaskaitosNr;
    private double suma;

    private MokejimoIstorija[] istorija = new MokejimoIstorija[100];
    private int mokejimuIstorijosIrasai = 0;


    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getImonesKodas() {
        return imonesKodas;
    }

    public void setImonesKodas(String imonesKodas) {
        this.imonesKodas = imonesKodas;
    }

    public String getBankoSaskaitosNr() {
        return bankoSaskaitosNr;
    }

    public void setBankoSaskaitosNr(String bankoSaskaitosNr) {
        this.bankoSaskaitosNr = bankoSaskaitosNr;
    }

    @Override
    public String getBankoSakaitosNr() {
        return bankoSaskaitosNr;
    }

    @Override
    public String getSaskaitosSavininkas() {
        return pavadinimas;
    }

    @Override
    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public MokejimoIstorija[] getIstorija() {
//        return istorija;
        if (mokejimuIstorijosIrasai == 0) return null;
//        sukuriame masyvo kopija, kad nebutu galima keisti masyvo duomenu is vidaus
        MokejimoIstorija[] klonas = new MokejimoIstorija[mokejimuIstorijosIrasai];
//        Javos metodas arraycopy leidzia atspausdinti masyva, panasiai, kaip su ciklu, tik efektyviau
//        nurodant: pradini masyva, spausdinimo pradzios vieta, kopijos pavadinima, kopijos masyvo pradzios vieta, kiek kopijuojame
        System.arraycopy(istorija,0, klonas, 0, mokejimuIstorijosIrasai);
        return klonas;
    }

    public void pridetiMokejimuIstorija (MokejimoIstorija mokejimoIstorija) {
        istorija[mokejimuIstorijosIrasai] = mokejimoIstorija;
        mokejimuIstorijosIrasai++;
    }
}
