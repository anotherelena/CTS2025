import java.util.ArrayList;
public class JucatorHandbal extends JucatorPrototype {

    JucatorHandbal(){
        super();
        this.antrenamente.add("Alergat in maini");
        this.medicamenteInterzise.add("Flying potions");
    }

    JucatorHandbal(String nume, String pozitie){
        super(nume, pozitie);
        this.antrenamente.add("Alergat in maini");
        this.medicamenteInterzise.add("Flying potions");
    }

    @Override
    public JucatorPrototype clone(){
        JucatorHandbal clona = new JucatorHandbal();
        clona.nume = nume;
        clona.pozitie = pozitie;
        clona.antrenamente = new ArrayList<>(this.antrenamente);
        clona.medicamenteInterzise = new ArrayList<>(this.medicamenteInterzise);
        return clona;

    }
    
}
