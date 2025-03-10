public class FabricaCombinata extends FabricaPacheteTuristice {
     @Override
     public PachetTuristic crearePachet(String tipCazare, String tipTransport){
        return new PachetCazareTransport(tipCazare, tipTransport);
     }
}
