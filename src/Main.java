//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


    //  TIPO NOME = new TIPO();

        ContaBancaria minhaConta = new ContaBancaria(200,"3042");
        ContaBancaria minhaConta2 = new ContaBancaria(200,"3041");
        minhaConta.exibirSaldo();
        minhaConta.depositar(3000);
        minhaConta.sacar(100);
        minhaConta.transferencia(minhaConta2,100);











































































    }
}