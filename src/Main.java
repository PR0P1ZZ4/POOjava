//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


    //  TIPO NOME = new TIPO();

        Carro meuCarro = new Carro("Chevrolet",60000,4);
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", 30000,21);
        System.out.println("Carro: " + meuCarro.getMarca() + " com " + meuCarro.getNumeroDePorta() + " portas.");
        System.out.println("Bicicleta: " + minhaBicicleta.getMarca() + " com " + minhaBicicleta.getNumeroDeMarchas() + " marchas.");
        Turma turmaB = new Turma("Turma de Java","Turma Java");
         turmaB.adicionarAluno("Samuel");
         turmaB.adicionarAluno("Julia");
         turmaB.adicionarAluno("Matheus");
         turmaB.adicionarAluno("Guilherme");
         turmaB.adicionarAluno("Lucas");
        turmaB.listarAlunos();















































































    }
}