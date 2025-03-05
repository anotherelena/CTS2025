package cts.quality.testing.discount;

import cts.quality.testing.magazin.Magazin;
import cts.quality.testing.magazin.Comanda;
import cts.quality.testing.magazin.Client;

public class DiscountMagazinDecorator extends Magazin {
    private Magazin magazin;
    private final double discountRate = 0.10;

    public DiscountMagazinDecorator(Magazin magazin) {
        this.magazin = magazin;
    }

    @Override
    public double calculeazaTotal(Comanda comanda) {
        double totalFaraDiscount = magazin.calculeazaTotal(comanda);
        Client client = comanda.getClient();

        if(!client.isDiscountUtilizat()){
            double discount = totalFaraDiscount * discountRate;
            comanda.setDiscountAplicat(true);
            client.setDiscountUtilizat(true);
            return totalFaraDiscount - discount;
        }

        return totalFaraDiscount;
    }
    
}
