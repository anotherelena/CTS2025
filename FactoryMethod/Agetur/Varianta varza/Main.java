public class Main{
    public static void main(String[] args){
        //Fabrica de cazare:
        FabricaPacheteTuristice fabricaCazare = new FabricaCazare();

        // cerem un pachet 
        PachetTuristic pachetHotel = fabricaCazare.crearePachet("hotel");
        if(pachetHotel != null){
            System.out.println("===Pachetul Solicitat (Hotel) ===");
            System.out.println(pachetHotel.descriere());
        }

        FabricaPacheteTuristice fabricaTransport = new FabricaTransport();

        PachetTuristic pachetAutobuz = fabricaTransport.crearePachet("autobuz");
        if(pachetAutobuz != null) {
            System.out.println("===Pachetul Solicitat (Autobuz) ===");
            System.out.println(pachetAutobuz.descriere());
        }
        
        FabricaPacheteTuristice fabricaCombinata = new FabricaCombinata();

        PachetTuristic pachet1 = fabricaCombinata.crearePachet("hotel-autobuz");
            if(pachet1 != null){
                System.out.println(pachet1.descriere());
            }
    }
}
