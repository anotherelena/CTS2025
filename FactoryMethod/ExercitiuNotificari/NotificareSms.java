public class NotificareSms implements INotificare {

    private String mesaj;

    public NotificareSms(String mesaj){
        this.mesaj = mesaj;
    }

    @Override
    public void trimiteNotificare(){
        System.out.println("Trimitere notificare prin SMS: " + mesaj);
    }
    
}
