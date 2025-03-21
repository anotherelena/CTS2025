public class Main {
    public static void main(String [] args){
        JucatorFotbal prototipFotbalist = new JucatorFotbal();
        JucatorHandbal prototipHandbalist = new JucatorHandbal();

        SubiectMedicamente subiectMedicamente = new SubiectMedicamente();

        JucatorPrototype jucator1 = prototipFotbalist.clone();
        jucator1.setNume("Gica Hagi");

        JucatorPrototype jucator2 = prototipHandbalist.clone();
        jucator2.setNume("Gheorghe Gruia");

        JucatorPrototype jucator3 = prototipFotbalist.clone();
        jucator3.setNume("Maradona");

        subiectMedicamente.adaugaObservator(jucator1);
        subiectMedicamente.adaugaObservator(jucator2);
        subiectMedicamente.adaugaObservator(jucator3);

        System.out.println("Antrenamente de inceput:");
        jucator1.afiseazaAntrenamente();
        jucator2.afiseazaAntrenamente();
        jucator3.afiseazaAntrenamente();

        System.out.println("Actualizare antrenamente: ");
        jucator1.actualizeazaAntrenamente("Masaj de batranete");

        System.out.println("Testare Anti-Doping inceput sezon:");
        jucator1.testeazaAntiDoping();
        jucator2.testeazaAntiDoping();
        jucator3.testeazaAntiDoping();

        System.out.println("Notificare medicament nou interzis:");
        subiectMedicamente.notificareObservatori("Hormoni de cal");

        System.out.println("Testare doping actualizata: ");
        jucator1.testeazaAntiDoping();
        jucator2.testeazaAntiDoping();
        jucator3.testeazaAntiDoping();

    }
    
}
