import java.util.*;

public class Artigo implements Publicacao {
    private String nome;
    private List<String> autores = new ArrayList<>();

    public void addAutor(String autor) {
        autores.add(autor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "nome=" +
                getNome() +
                "; autores=" + autores +
                '}';
    }

    @Override
    public int getCount() {
        return 1;
    }
}
