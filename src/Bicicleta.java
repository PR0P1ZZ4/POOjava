public class Bicicleta  extends Veiculo  {
    public int numeroDeMarchas;

    public Bicicleta(String marca, double preco, int numeroDeMarchas) {
        super(marca, preco);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }
}

