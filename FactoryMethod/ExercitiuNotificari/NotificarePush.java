public class NotificarePush implements INotificare {

    private String mesaj;

    public NotificarePush(String mesaj){
        this.mesaj = mesaj;
    }

    @Override 
    public void trimiteNotificare(){
        System.out.println("Mesaj trimis push: " + mesaj);
    }
    
}
