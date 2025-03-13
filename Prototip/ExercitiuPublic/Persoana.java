/*Clasa persoana - reprezinta o persoana din public
 * ea trebuie sa implementeze interfata prototip dar si cea cloneable
 * ca sa folosim super.clone()
 * ii facem constructor, metoda super.clone pt a clona
 * dupa o metoda de tostring sa o putem afisa
 * si getteri setteri
 */

public class Persoana implements Prototip, Cloneable {
    private String nume;
    private int varsta;


    public Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override 
    public Persoana cloneaza(){
        try{
            return (Persoana) super.clone();
        } catch (CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public String toString(){
        return "Persoana [nume=" + nume + ", varsta=" + varsta + "]";
    }
    
    public String getNume(){
        return nume;
    }

    public int getVarsta(){
        return varsta;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public void setVarsta(int varsta){
        this.varsta = varsta;
    }
}
