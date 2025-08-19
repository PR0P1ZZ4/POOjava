public class Turma extends Aluno {

    public String nomeDaTurma;

    public Turma(String nome, String nomeDaTurma) {
        super(nome);
        this.nomeDaTurma = nomeDaTurma;
    }
    public void adicionarAluno (String aluno2){

        nome = nome + aluno2;

    }

    public Aluno [] Alunos;

    public void listarAlunos()
    {
        for (int i = 0; i < Alunos.length; i++) {
            System.out.println(Alunos[i]);
        }
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }
}