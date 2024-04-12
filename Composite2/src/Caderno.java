import java.util.ArrayList;
import java.util.List;

public class Caderno implements Publicacao{
    private String nome;
    private List<Publicacao> publicacaos = new ArrayList<>();

    public void addPublicao(Publicacao publicacao) {
        publicacaos.add(publicacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void nomePublicacao(){
        System.out.print("Nome Publicacoes: ");
        for(Publicacao p : publicacaos){
            if(p != null){
                System.out.print(p.getNome());
                System.out.print(", ");
            }
        }
    }

    public List getPublicacoes(){
        return publicacaos;
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "nome= " +
                getNome() +
                '}';
    }

    @Override
    public int getCount() {
        int totAssento = 0;
        for(Publicacao p : publicacaos){
            if(p != null){
                totAssento += p.getCount();
            }
        }
        return totAssento;
    }
}
