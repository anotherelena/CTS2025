//Creator cu o metoda abstracta care trebuie suprascrisa de creatorii concreti
//metoda primeste un parametru de tipPachet(transport sau cazare) si intoarce un pachet turistic 
//Practic crearePachet instantiaza pachetele turistice concrete

//CLASA ABSTRACTA: e ca un schelet (nu o poti implementa pe ea direct) - subclasele ei vor folosi extends
//e folosita pt a grupa functionalitati comune
public abstract class FabricaPacheteTuristice {
    public abstract PachetTuristic crearePachet(String tipPachet);
}
