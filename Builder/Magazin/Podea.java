public class Podea {
    private boolean personalizata;
    private double duritate;

    public Podea(boolean personalizata, double duritate) {
        this.personalizata = personalizata;
        this.duritate = duritate;
    }

    public boolean isPersonalizata(){
        return personalizata;
    }

    public double getDuritate(){
        return duritate;
    }

    @Override
    public String toString(){
        return "Podea [personalizata =" +personalizata + ",duritate= " + duritate + "]";
    }
}
