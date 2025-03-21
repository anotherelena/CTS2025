import java.util.List;
import java.util.ArrayList;

public class SubiectMedicamente {
   private List<ObservatorMedicamente> observatori;
   
   public SubiectMedicamente(){
    this.observatori = new ArrayList<>();
   }

   public void adaugaObservator(ObservatorMedicamente observator){
    if(!this.observatori.contains(observator)){
        this.observatori.add(observator);
    }
   }

   public void stergeObservator(ObservatorMedicamente observator){
    this.observatori.remove(observator);
   }

   public void notificareObservatori(String medicamentNou){
    for(ObservatorMedicamente observator : observatori){
        observator.actualizeazaListaMedicamenteInterzise(medicamentNou);
    }
   }
}
