public class Facade {
    public void matricular(int codAluno, int codCurso, Turma turma){
        Escola escola = new Escola();
        if (turma == null){
            turma = new Turma();
            Curso c = escola.getCurso(codCurso);
        }
        Aluno rex = escola.getAluno(codAluno);
        turma.addAlunos(rex);
    }

    public void exibirStatus(Turma turma){
        Curso cursoFId = new Curso();
        cursoFId.
    }
}
