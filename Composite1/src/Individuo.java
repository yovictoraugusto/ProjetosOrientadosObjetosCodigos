public class Individuo extends Participante{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getAssento() {
        return 1;
    }

    @Override
    public int getMembro() {
        return 1;
    }
}
