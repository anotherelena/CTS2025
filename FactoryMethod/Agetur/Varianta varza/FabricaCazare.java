//fabricatorul concret de cazare: el extinde fabricapacheteturistice si suprascrie metoda crearePachet
//ii dam cazuri in functie de pachet: hotel sau cabana si se creeaza un obiect din astea sau null sau exceptie daca nu recunoaste tipul de pachet introdus
//EXTENDS Adica Mosteneste! in java e mereu single inheritance!! o clasa extinde o singura clasa-bleah
public class FabricaCazare extends FabricaPacheteTuristice {
    @Override
    public PachetTuristic crearePachet(String tipPachet){
        if(tipPachet.equalsIgnoreCase("hotel")){
            return new CazareHotel();
        }else if (tipPachet.equalsIgnoreCase("cabana")){
            return new CazareCabana();
        }else{
            System.out.println("Nu stim tipul asta de cazare: " + tipPachet);
            return null;
        }
    }
}
