import java.util.Arrays;

public class Main{
    public static void main(String[] args){

        try{
            Magazin magazin1 = new Magazin.Builder("Magazin Electro", 150)
                    .nrIntrari(2)
                    .build();

            Magazin magazin2 = new Magazin.Builder("Magazin fashion", 250)
                    .nrIntrari(3)
                    .podea(new Podea(true, 3.5))
                    .adaugaDecoratii(Arrays.asList(
                        new Decoratie("lemn"),
                        new Decoratie("Metal")
                    ))
                   .build();
            Magazin magazin3 = new Magazin.Builder("Magazin home", 90)
                    .podea(new Podea(true, 1.5))
                    .build();

            System.out.println(magazin1);
            System.out.println("Grad incendiu:" + magazin1.calculGradIncendiu());
            System.out.println("_______________________");

            System.out.println(magazin2);
            System.out.println("Grad incendiu:" + magazin2.calculGradIncendiu());
            System.out.println("_______________________");
            
            System.out.println(magazin3);
            System.out.println("Grad incendiu:" + magazin3.calculGradIncendiu());
            System.out.println("_______________________");

        } catch (MagazinException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}
