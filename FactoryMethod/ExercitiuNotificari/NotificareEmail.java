public class NotificareEmail implements INotificare {
    private String mesaj;

    public NotificareEmail(String mesaj){
        this.mesaj = mesaj;
    }

    @Override
    public void trimiteNotificare(){
        System.out.println("Trimite Notificare Email: " + mesaj);
    }
    
}
