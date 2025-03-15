/*Enunțul Problemei

Se dezvoltă o aplicație software destinată gestionării notificărilor într-un sistem de comerț electronic. Notificările pot fi de diferite tipuri, după cum urmează:

    Notificare prin Email
    Notificare prin SMS
    Notificare prin Push

Fiecare tip de notificare are propriul mod de trimitere și un mesaj specific asociat. Deoarece procesul de creare a notificărilor poate varia în funcție de tipul acestora și pentru a respecta principiile de design (se dorește ca modulul de creare să fie flexibil, extensibil și izolat de detaliile de implementare ale notificărilor concrete), se impune implementarea unui pattern creațional care să permită clienților (codul care utilizează notificările) să creeze notificările fără a cunoaște clasele concrete.

Cerințe:

    Implementați un design conform cu definiția pattern-ului Factory Method din GoF.
    Soluția trebuie să conțină cel puțin trei tipuri concrete de notificări (Email, SMS, Push).
    Se va realiza o clasă de tip „Factory” care, pe baza unui parametru de tip (de exemplu, un șir de caractere), va crea și returna instanța corespunzătoare notificării.
    Testați soluția prin crearea a cel puțin două notificări pentru fiecare tip și afișați mesajele trimise la consolă.
    Codul trebuie să respecte principiile Clean Code (nume descriptive, organizare în pachete, comentarii explicative etc.). */



public class Main{
    public static void main(String[] args){
        INotificare email = NotificareFactory.creeazaNotificare("email", "Ti-am furat banii hihi");
        INotificare sms = NotificareFactory.creeazaNotificare("sms", "ti-ai pierdut telefonul");
        INotificare push = NotificareFactory.creeazaNotificare("push", "Cutremur!");

        System.out.println("NOTIFICARI:  ");
        email.trimiteNotificare();
        sms.trimiteNotificare();
        push.trimiteNotificare();
    }

}
