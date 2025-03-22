public class StaffMedicalFactory{
    public static Staff creeazaStaff(TipStaff tip, String nume){
        switch(tip){
            case Asistenta:
                return new Asistenta(nume);
            case Doctor:
                return new Doctor(nume);
            default:
                throw new IllegalArgumentException("Nu cunoastem tipul asta");
        }
    }
}
    

