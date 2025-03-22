public class Pacient {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;

    private Pacient(PacientBuilder builder){
        this.nume = builder.nume;
        this.patRabatabil = builder.patRabatabil;
        this.micDejun = builder.micDejun;
        this.papuci = builder.papuci;
    }
    @Override
    public String toString(){
        return "Pacient " + nume + patRabatabil + micDejun + papuci;
    }

    public static class PacientBuilder{
        private String nume;
        private boolean patRabatabil = false;
        private boolean micDejun = false;
        private boolean papuci = false;
    
    public PacientBuilder(String nume){
        this.nume = nume;
    }
    public PacientBuilder setPatRabatabil(boolean pat){
        this.patRabatabil = pat;
        return this;
    }
    public PacientBuilder setMicDejun(boolean micD){
        this.micDejun = micD;
        return this;
    }
    public PacientBuilder setPapuci(boolean pap){
        this.papuci = pap;
        return this;
    }

    public Pacient build(){
        return new Pacient(this);
    }


    
  }
}
