import java.util.ArrayList;
import java.util.List;

public abstract class JucatorPrototype implements Cloneable, ObservatorMedicamente{
    protected String nume;
    protected String pozitie;
    protected List<String> antrenamente;
    protected List<String> medicamenteInterzise;

    public JucatorPrototype(){
        this.antrenamente = new ArrayList<>();
        this.medicamenteInterzise = new ArrayList<>();
        }

    public JucatorPrototype(String nume, String pozitie){
        this.nume = nume;
        this.pozitie = pozitie;
        this.antrenamente = new ArrayList<>();
        this.medicamenteInterzise = new ArrayList<>();
    }

    public void adaugaMedicamentInterzis(String medicament){
        if(!this.medicamenteInterzise.contains(medicament)){
            this.medicamenteInterzise.add(medicament);
            System.out.println("Jucatorul " + this.nume + " a adaugat medicamentul: " + medicament);
        }
    }

    public void actualizeazaAntrenamente(String antrenament){
        if(!this.antrenamente.contains(antrenament)){
            this.antrenamente.add(antrenament);
            System.out.println("Jucatorul " + this.nume + " trebuie sa faca si antrenamentul " + antrenament);
        }
    }

    public void afiseazaAntrenamente(){
        System.out.println("Jucatorul " + this.nume + " are urmatoarele antrenamente: ");
        for(String antrenament : antrenamente) {
            System.out.println("- " + antrenament);
        }
    }

    public void testeazaAntiDoping(){
        System.out.println("Jucatorul " + this.nume + "este testat pentru urmatoarele medicamente: ");
        for(String medicament : medicamenteInterzise){
            System.out.println("- " + medicament);
        }
    }

    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return this.nume;
    }

    @Override
    public abstract JucatorPrototype clone();

    @Override
    public void actualizeazaListaMedicamenteInterzise(String medicamentNou){
        if(!this.medicamenteInterzise.contains(medicamentNou)){
            this.medicamenteInterzise.add(medicamentNou);
            System.out.println("Jucatorul " +this.nume + "a fost notificat despre noul medicament interzis: " + medicamentNou);
        }
    }


    
}
