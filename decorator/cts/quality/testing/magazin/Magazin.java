package cts.quality.testing.magazin;

import javax.management.ConstructorParameters;

public class Magazin {
 /**
     * 
     * @param comanda 
     * @return
     */
    public double calculeazaTotal(Comanda comanda) {
        double shippingCost = 10.0;
        return comanda.getValoareCos()+shippingCost;
    }
}
