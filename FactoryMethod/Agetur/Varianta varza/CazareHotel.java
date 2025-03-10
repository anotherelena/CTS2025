//pe cand implements se foloseste la intefete - si poate implementa una sau mai multe interfete
//clasa se OBLIGA sa ofere implementari pentru toate metodele abstracte oferite in acea interfata

public class CazareHotel implements PachetTuristic {
    @Override
    public String descriere(){
        return "Pachet de cazare la hotel de 3 stele cu mic dejun inclus.";
    }
}
