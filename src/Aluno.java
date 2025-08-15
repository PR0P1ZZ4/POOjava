public class Aluno {

    public Aluno (String nome, double nota){
        this.nota = nota;
        this.nome = nome;
    }

    public String nome;
    public double nota;

    public void mostrarInformacao (){
        System.out.println("Nome" + nome);
        System.out.println("Nota" + nota);
        if (nota >= 7) {
            System.out.println("Aprovado!");

        }
        else {
            System.out.println("Reprovado!");
        }
    }
}
