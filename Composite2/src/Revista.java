import java.util.*;

public class Revista implements Publicacao{
    private String nome;
    private List<Artigo> artigos = new ArrayList<>();

    public void addArtigo(Artigo artigo) {
        artigos.add(artigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void nomeArtigos(){
        System.out.print("Nome artigos: ");
        for(Artigo a : artigos){
            if(a != null){
                System.out.print(a.getNome());
                System.out.print(", ");
            }
        }
    }

    public List getPublicacoes(){
        return artigos;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nome= " +
                getNome() +
                '}';
    }

    @Override
    public int getCount() {
        return artigos.size();
    }
}
