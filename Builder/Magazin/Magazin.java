import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Magazin {
    private final String denumire;
    private final double suprafata;
    private final int nrIntrari;
    private final Podea podea;
    private final List<Decoratie> decoratiuni;

    private Magazin (Builder builder){
        this.denumire = builder.denumire;
        this.suprafata = builder.suprafata;
        this.nrIntrari = builder.nrIntrari;
        this.podea = builder.podea;

        this.decoratiuni = Collections.unmodifiableList(builder.decoratiuni);
    }

    public double calculGradIncendiu(){
        double grad = 0.0;
        grad+= this.podea.getDuritate() * 10;
        for(Decoratie decor : decoratiuni) {
            String material = decor.getMaterial().toLowerCase();
            switch (material) {
                case "metal":
                    grad +=3;
                    break;
                case "lemn":
                    grad +=2;
                    break;
                case "sticla":
                    grad +=4;
                    break;
                default:
                    grad +=1;
                    break;
            }
        }
        return grad;
    }

    public String getDenumire(){
        return denumire;
    }
    public double getSuprafata(){
        return suprafata;
    }
    public int getNrIntrari(){
        return nrIntrari;
    }
    public Podea getPodea(){
        return podea;
    }
    public List<Decoratie> getDecoratiuni(){
        return decoratiuni;
    }

    @Override 
    public String toString(){
        return "Magazin [denumire: " + denumire + " suprafata: " + suprafata + " nr Intrari: " + nrIntrari + " podea: " + podea + " decoratiuni: " + decoratiuni + "]";
    }


    public static class Builder {
        private String denumire;
        private double suprafata;
        private int nrIntrari = 1;
        private Podea podea;
        private List<Decoratie> decoratiuni = new ArrayList<>();

        public Builder (String denumire, double suprafata){
            this.denumire = denumire;
            this.suprafata = suprafata;
        }

        public Builder nrIntrari(int nrIntrari) {
            this.nrIntrari = nrIntrari;
            return this;
        }

        public Builder podea(Podea podea){
            this.podea = podea;
            return this;
        }

        public Builder adaugaDecoratie(Decoratie decor){
            this.decoratiuni.add(decor);
            return this;
        }

        public Builder adaugaDecoratii(List<Decoratie> decoratii){
            this.decoratiuni.addAll(decoratii);
            return this;
        }

        public Magazin build() throws MagazinException{
            int intrariMinime = (int) Math.ceil(suprafata / 100.0 );
            if(nrIntrari < intrariMinime) { 
                throw new MagazinException ("Numar de intrari insuficient. Pentru suprafata de " + suprafata + "mp, este necesar cel putin " + intrariMinime + " intrari.");
            }

            if(podea == null) {
                podea = new Podea(false, 5.0);
            }

            if(podea.isPersonalizata()){
                if(podea.getDuritate() < 2.0){
                    for(Decoratie decor : decoratiuni){
                        if(decor.getMaterial().equalsIgnoreCase("sticla")){
                            throw new MagazinException("Decoratiunea din sticla nu este permisa pe podea cu duritatea <2");
                        }
                    }
                }
            }
            return new Magazin(this);
        }
    }


}
