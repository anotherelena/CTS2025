public class Main {
    public static void main(String[] args){

        Public publicOriginal = new Public();

        publicOriginal.adaugaPersoana(new Persoana("Marx", 87));
        publicOriginal.adaugaPersoana(new Persoana("Lenin", 92));
        publicOriginal.adaugaPersoana(new Persoana("Engels", 121));

        System.out.println("Public original: ");
        System.out.println(publicOriginal.toString());

        Public publicClonat = publicOriginal.cloneaza();

        System.out.println("Public clonat: ");
        System.out.println(publicClonat.toString());

        publicClonat.getListaPersoane().get(0).setNume("Mao");

        System.out.println("Clonare modificata: ");
        System.out.println("Public original: ");
        System.out.println(publicOriginal.toString());
        System.out.println("Public clonat: ");
        System.out.println(publicClonat.toString());
    }
    
}
