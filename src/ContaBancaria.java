import java.sql.SQLOutput;

public class ContaBancaria {
    public String titular;
    private double saldo;
public ContaBancaria (String titular, double saldo){
    this.titular = titular;
    this.saldo = saldo;


}
    public double getSaldo (){
    return saldo;
    }



    public void depositar (double valor){

        saldo = saldo + valor;
        // saldo += valor; forma resumida

        }
    public void sacar (double valor){
        saldo -= valor;

    }

    public void exibirDados (){

        System.out.println(" Titular " + titular);
        System.out.println(" Saldo " + saldo);

    }


}
