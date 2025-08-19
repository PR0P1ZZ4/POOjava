public class Veiculo {
    String marca;
    double preco;

    public Veiculo(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }


    protected String getMarca() {
        return marca;
    }

    protected double getPreco() {
        return preco;
    }
}
