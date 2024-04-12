public class Main {
    public static void main(String[] args) {
        Instituicao unifesp = new Instituicao();
        Individuo[] aluno = new Individuo[6];

        unifesp.add(aluno[0]);
        unifesp.add(aluno[1]);
        unifesp.add(aluno[2]);
        unifesp.add(aluno[3]);
        unifesp.add(aluno[4]);
        unifesp.add(aluno[5]);
        System.out.println("Quantidade de participantes UNIFESP: "+unifesp.getMembro());
        System.out.println("Quantidade de assentos da UNIFESP: " + unifesp.getAssento());

        Congresso sbc = new Congresso();
        sbc.add(unifesp);
        Individuo[] alunos = new Individuo[3];
        alunos[0] = new Individuo();
        alunos[1] = new Individuo();
        alunos[2] = new Individuo();
        sbc.add(alunos[0]);
        sbc.add(alunos[1]);
        sbc.add(alunos[2]);

        System.out.println("Quantidade de participantes SBC: "+sbc.totalParticipantes());
        System.out.println("Quantidade de assentos da SBC: "+sbc.totalAssentos());
    }
}