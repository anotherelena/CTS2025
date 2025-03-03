public class Main {
    public static void main(String[] args){
        AgeTur agentia = AgeTur.getInstanta();

        PachetTuristic pachet1 = new PachetTuristic(1, "Vacanta Grecia");
        PachetTuristic pachet2 = new PachetTuristic(2, "Vacanta Bulgaria");

        agentia.adaugaPachet(pachet1);
        agentia.adaugaPachet(pachet2);

        agentia.vindePachet(1);
        agentia.vindePachet(1);

        agentia.vindePachet(3);
    }
}
