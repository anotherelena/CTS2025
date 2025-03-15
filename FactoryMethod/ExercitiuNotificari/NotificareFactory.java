public class NotificareFactory {

    public static INotificare creeazaNotificare(String tip, String mesaj){
        if(tip.equalsIgnoreCase("email")){
            return new NotificareEmail(mesaj);
        } else if(tip.equalsIgnoreCase("sms")){
            return new NotificareSms(mesaj);
        } else if(tip.equalsIgnoreCase("push")){
            return new NotificarePush(mesaj);
        } else{
            throw new IllegalArgumentException("Nu stim pnm");
        }
    }
    
}
