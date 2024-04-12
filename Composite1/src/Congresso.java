import java.util.*;

public class Congresso{
    protected List<Participante> participantes = new ArrayList();

    public void add(Participante participante){
        participantes.add(participante);
    }

    public int totalParticipantes(){
        return participantes.size();
    }

    public int totalAssentos(){
        int totAssento = 0;
        for(Participante participante : participantes){
            if(participante != null){
                totAssento += participante.getAssento();
            }
        }
        return totAssento;
    }
}
