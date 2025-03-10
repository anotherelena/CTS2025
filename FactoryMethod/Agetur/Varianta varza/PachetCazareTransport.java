public class PachetCazareTransport implements PachetTuristic {
    private String tipCazare;
    private String tipTransport;
    
    public PachetCazareTransport(String tipCazare, String tipTransport){
        this.tipCazare = tipCazare;
        this.tipTransport = tipTransport;
    }

    @Override
    public String descriere() {
        return "Pachet complet: Cazare la " + tipCazare + " si transport asigurat prin: " + tipTransport;
    }
}
