package cts.quality.testing.magazin;

public class Comanda {
    private Client client;
    private double valoareCos;
    private boolean discountAplicat;

    public Comanda(Client client, double valoareCos) {
        this.client = client;
        this.valoareCos = valoareCos;
        this.discountAplicat = false;
    }

    public Client getClient() {
        return client;
    }

    public double getValoareCos() {
        return valoareCos;
    }

    public void setDiscountAplicat(boolean discountAplicat) {
        this.discountAplicat = discountAplicat;
    }
    
    public boolean isDiscountAplicat() {
        return discountAplicat;
    }
}
