public class Doctor extends Staff {
    public Doctor(String nume){
        super(nume);
    }
    @Override
    public void lucreaza(){
        System.out.println(nume + " lucreaza ca medic");
    }
    
}
