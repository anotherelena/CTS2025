public class Main {
    public static void main(String[] args){
        FabricaPacheteTuristice fabricaCombinata = new FabricaCombinata();

        PachetTuristic pachet1 = fabricaCombinata.crearePachet("Hotel de 4 stele", "Autobuz");
        System.out.println(pachet1.descriere());

        PachetTuristic pachet2 = fabricaCombinata.crearePachet("cabana montana ", "tren");
        System.out.println(pachet2.descriere());
    }
    
}
