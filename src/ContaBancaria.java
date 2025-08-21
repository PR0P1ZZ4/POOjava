public class ContaBancaria implements OperacoesConta {
   private double saldo;
   private String numeroConta;
    public ContaBancaria(double saldo, String numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    // ação de depositar
    public void depositar (double valor){
        saldo += valor;

    }

    // ação de sacar
    public void sacar (double valor){

        if(saldo < valor) {
            System.out.println(" Saque Recusado valor menor que o permitido ");
        } else {
            saldo -= valor;
        }


    }

    @Override
    public void exibirdados() {

    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void transferencia(ContaBancaria destino, double valor) {

        sacar(valor);
        destino.depositar(valor);
    }

    public void exibirSaldo (){
        System.out.println(" Numero da conta " + numeroConta);
        System.out.println(" Saldo " + saldo);
    }

}