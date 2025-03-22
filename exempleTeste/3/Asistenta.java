public class Asistenta extends Staff {

    public Asistenta (String nume){
        super(nume);
    }
    @Override
    public void lucreaza(){
        System.out.println(nume + " e asistenta");
    }
     
}
