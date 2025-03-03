import java.util.HashMap;
import java.util.Map;
//clasa agetur ca singleton
public class AgeTur{
    private static AgeTur instanta = null;
    private Map<Integer, PachetTuristic> pachete; //hashmap cu cheie id
    //constructor privat care sa interzica instantierea din exterior:
    private AgeTur(){
        pachete = new HashMap<>();
    }
    //Metoda statica!! pt obtinerea singurei instante
    public static AgeTur getInstanta(){
        if(instanta == null){
            instanta = new AgeTur();
        }
        return instanta;
    }
    //metoda adaugare pahet
    public void adaugaPachet(PachetTuristic pachet){
        pachete.put(pachet.getId(), pachet);
    }
    //metoda de vanzare a unui pachet turistic:
    public void vindePachet(int id){
        PachetTuristic pachet = pachete.get(id);
        if(pachet ==null){
            System.out.println("Pachetul cu ID-ul " + id + " nu exista.");
        } else if(pachet.eVandut()){
            System.out.println("Pachetul " + pachet.getNume() + " a fost deja vandut.");
        } else{
            pachet.marcheazaVandut();
            System.out.println("Pachetul " + pachet.getNume() + " a fost vandut cu succes!");
        }
    }
}