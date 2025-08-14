//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


    //  TIPO NOME = new TIPO();
    Carro carro1 = new Carro();
    //            instanciar a classe
    carro1.modelo = "Opala";
    carro1.ano = 1981;
    carro1.marca = "Chevrolet";
    carro1.cor = "Preto";
    carro1.motor = "4.1 V6 cilindro";
    carro1.descrição = "Manual com 4 portas e vidro eletrico nas 4 porta com ar condicionado";
    carro1.mostrarInformacao();

    Carro carro2 = new Carro();
    carro2.modelo = "Ka";
    carro2.marca = "Ford";
    carro2.ano = 2018;
    carro2.cor = "Branco";
    carro2.motor = "1.0 3 cilindro";
    carro2.descrição = "Manual com 4 portas e vidro eletrico so na frente";
    carro2.mostrarInformacao();

        Aluno estudante = new Aluno();
        estudante.nota = 5;
        estudante.nome = " Samuel";

        estudante.mostrarInformacao();

        Aluno estudante2 = new Aluno();
        estudante2.nome = " Julia";
        estudante2.nota = 10;

        estudante2.mostrarInformacao();
























































































    }
}