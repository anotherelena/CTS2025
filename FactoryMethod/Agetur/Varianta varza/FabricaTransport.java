//acelasi lucru extindem fabrica abstracta si override metoda cu constructorii concreti

public class FabricaTransport extends FabricaPacheteTuristice {
    @Override
    public PachetTuristic crearePachet(String tipPachet){
        if(tipPachet.equalsIgnoreCase("microbuz")){
            return new TransportMicrobuz();
        } else if(tipPachet.equalsIgnoreCase("autobuz")){
            return new TransportAutobuz();
        }else{
            System.out.println("Nu stim metoda asta de transport: " + tipPachet);
            return null;
        }
    }
    
}
