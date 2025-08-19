public class Carro  extends Veiculo   {

    public int numeroDePorta;

    public Carro(String marca, double preco, int numeroDePorta) {
        super(marca, preco);
        this.numeroDePorta = numeroDePorta;
    }

    public int getNumeroDePorta() {
        return numeroDePorta;
    }
}
