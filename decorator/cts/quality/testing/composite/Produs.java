package cts.quality.testing.composite;

public class Produs implements IProdus{
    private String denumire;
    private int stoc;

    public Produs(String denumire, int stoc){
        this.denumire = denumire;
        this.stoc = stoc;
    }

    @Override
    public int numaraProduse(){
        return 1;
    }
    @Override
    public void afiseazaInformatii() {
        System.out.println("Produs: " + denumire + ", Stoc: " + stoc);
    }
}
