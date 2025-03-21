import java.util.ArrayList;

public class JucatorFotbal extends JucatorPrototype {
    
    public JucatorFotbal(){
        super();
        this.pozitie = "Nedefinit";

        this.antrenamente.add("Alergare");
        this.antrenamente.add("Jocul cu mingea");

        this.medicamenteInterzise.add("Steroizi");
        this.medicamenteInterzise.add("Nurofen");
    }

    public JucatorFotbal(String nume, String pozitie){
        super(nume, pozitie);

        this.antrenamente.add("Alergare");
        this.antrenamente.add("Jocul cu mingea");

        this.medicamenteInterzise.add("Steroizi");
        this.medicamenteInterzise.add("Nurofen");
    }

    @Override
    public JucatorPrototype clone(){
        JucatorFotbal clona = new JucatorFotbal();
        clona.nume = this.nume;
        clona.pozitie = this.pozitie;
        clona.antrenamente = new ArrayList<>(this.antrenamente);
        clona.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);
        return clona;
    }

}
