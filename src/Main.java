//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


    //  TIPO NOME = new TIPO();
    Carro carro1 = new Carro(" Chevrolet "," Opala "," Preto ",4.1,1981," 4 porta e manual");
    //            instanciar a classe
    carro1.mostrarInformacao();

    Carro carro2 = new Carro(" Ford "," Ka "," Branco ",1.0,2018, " 4 portas manual com vidro eletrico so na frente ");
    carro2.mostrarInformacao();

        Aluno estudante = new Aluno(" Samuel",5);

        estudante.mostrarInformacao();

        Aluno estudante2 = new Aluno(" Julia",10);

        estudante2.mostrarInformacao();

        ContaBancaria minhaconta = new ContaBancaria(" Samuel ",2000);

        minhaconta.sacar(500);
        minhaconta.depositar(700);

        minhaconta.exibirDados();
        public String getNome(){

        }
        public void setNome (){


        }















































































    }
}