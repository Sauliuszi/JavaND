package bandymai;

public class Client {
//    2 budai susikurti konstruktoriu
//            1 budas su privat
    private String name;
    private String code;
    private String bankAccount;
    private double amount;

//    automatiskai sugeneruotas konstruktorius

    public Client(String name, String code, String bankAccount, double amount) {
        this.name = name;
        this.code = code;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


//                2 budas su public static
//    Kazkodel vis viena reikalauja visu 4 reiksmiu??? new Cliant(????);
//    public static Client forNameAndCode (String name, String code) {
//        Cliant klientas = new Cliant();
//        klientas.setName(name);
//        klientas.setCode(code);
//        return klientas;
//    }
}

