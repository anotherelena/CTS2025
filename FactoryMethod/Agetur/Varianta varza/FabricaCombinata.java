//Asta e gen o implementare varza. un miliard de if else-uri. hai sa schimbam

public class FabricaCombinata extends FabricaPacheteTuristice {
    @Override
    public PachetTuristic crearePachet(String tipPachet) {
        if(tipPachet.equalsIgnoreCase("hotel-autobuz")) {
            return new PachetCazareTransport("Hotel de 3 stele", "Autobuz");
        } else if (tipPachet.equalsIgnoreCase("cabana-microbuz")) {
            return new PachetCazareTransport("Cabana montana", " microbuz");
        } else if(tipPachet.equalsIgnoreCase("hotel-microbuz")){
            return new PachetCazareTransport("Hotel de doua stele", "microbuz");
        }else {
            System.out.println("nu stim ce zici tu acolo: " + tipPachet);
            return null;
        }
    }
    
}
