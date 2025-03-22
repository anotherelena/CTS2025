/*În cadrul aplicației personalul spitalului este de mai multe tipuri. Acestea sunt salvate într-un
enum { Brancardier, Asistent, Medic}. Să se implementeze modulul care pune la dispoziției crearea
de obiecte din familia obiectelor PersonalSpital in funcție de tipul primit ca parametru. */

enum TipStaff { Asistenta, Doctor}

public class Main{
    public static void main(String [] args){
        Staff asistenta = StaffMedicalFactory.creeazaStaff(TipStaff.Asistenta, "Alice" );
        Staff doctor = StaffMedicalFactory.creeazaStaff(TipStaff.Doctor, "Bob");

        asistenta.lucreaza();
        doctor.lucreaza();
    }
}
