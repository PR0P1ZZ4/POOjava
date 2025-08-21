public interface OperacoesConta {
    void depositar(double valor);
    void sacar(double valor);
    void exibirdados();
    double consultarSaldo();
    public void transferencia (ContaBancaria destino, double valor);
}
