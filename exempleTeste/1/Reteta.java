public class Reteta implements Cloneable {
    private String nume;
    private String ingrediente;

    public Reteta(String nume, String ingrediente){
        this.nume = nume;
        this.ingrediente = ingrediente;
    }

    @Override
    public Reteta clone(){
        try{
            return (Reteta) super.clone();
        }
        catch
            (CloneNotSupportedException e){
                throw new RuntimeException("Nu a mers clonarea");
            }
        
    }
    public void arataReteta(){
        System.out.println("Reteta: " + nume + " Ingrediente: " + ingrediente);
    }
}

