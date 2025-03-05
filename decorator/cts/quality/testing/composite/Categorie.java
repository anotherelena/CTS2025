package cts.quality.testing.composite;

import java.util.ArrayList;
import java.util.List;

import cts.quality.testing.composite.IProdus;

public class Categorie implements IProdus {
    private String denumire;
    private List<IProdus> produse;

    public Categorie(String denumire){
        this.denumire =denumire;
        this.produse = new ArrayList<>();
    }

    public void adaugaProdus(IProdus produs){
        produse.add(produs);
    }

    @Override
    public void afiseazaInformatii(){
        int totalProduse = numaraProduse();
        System.out.println("Categorie:  "+ denumire + " - Total produse: " + totalProduse);

        for(IProdus produs: produse) {
            produs.afiseazaInformatii();
        }
    }

    @Override
    public int numaraProduse(){
        int total = 0;
        for(IProdus produs : produse){
            total+= produs.numaraProduse();
        }
        return total;
    }
    
}
