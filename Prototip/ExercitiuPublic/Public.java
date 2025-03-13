/*Clasa public care contine lista de personae
 * metoda de adaugare persoana
 * returnare lista
 * override cloneaza pentru a face deep copy listei
 * override tostring pt a printa corect lista cu string builder 
  */

import java.util.ArrayList;
import java.util.List;

public class Public implements Prototip, Cloneable {
    private List<Persoana> listaPersoane;
    
    public Public(){
        listaPersoane = new ArrayList<>();
    }

    public void adaugaPersoana(Persoana persoana){
        listaPersoane.add(persoana);
    }

    public List<Persoana> getListaPersoane(){
        return listaPersoane;
    }

    @Override
    public Public cloneaza(){
        try{
            Public copiePublic = (Public) super.clone();

            copiePublic.listaPersoane = new ArrayList<>();

            for(Persoana persoana : this.listaPersoane){
                copiePublic.listaPersoane.add(persoana.cloneaza());
            }
            return copiePublic;
        } catch (CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Publicul din tribune:\n");

        for(Persoana persoana : listaPersoane) {
            sb.append(persoana.toString()).append("\n");
        }
        return sb.toString();
    }

}
