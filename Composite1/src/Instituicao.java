import java.util.*;

public class Instituicao extends Participante {
    protected List<Participante> participantes = new ArrayList();

    public void add(Participante participante){
        participantes.add(participante);
    }

    @Override
    public int getAssento() {
        return participantes.size();
    }

    @Override
    public int getMembro() {
        return 1;
    }
}
