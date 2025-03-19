public class Decoratie {
   
    private String material;

    public Decoratie(String material) {
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    @Override
    public String toString(){
        return "Decoratie: [material: " + material + "]";
    }

    
}
