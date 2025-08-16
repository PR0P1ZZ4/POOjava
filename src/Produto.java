public class Produto {
    public Produto (String nome, double preco, String marca, double tamanho){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
    }



    // public class nome {}
// 1. atributo quais sao
    // public TIPO nome;
    //tamanho, preço, cor, unidade, marca e nome
    public String nome;
    private double preco;
    public double tamanho;
    public String marca;
    public String cor;
    private int estoque;

    public double getPreco () {
        return preco;

    }

    public int getEstoque (){
        return estoque;

    }

    public void somarEstoque (int valor){
        estoque = estoque + valor;

    }

    public void setPreco(double preco) {
        this.preco += preco;
        if (preco < 0) {
            System.out.println(" Erro colocar valor positivo ");
        }
    }

    // 2. metodos quais sao
    // Mostra ações do Produto
    public void mostrarInformacoes () {
        System.out.println("Nome:" + nome);
        System.out.println("Preço:" + preco);
        System.out.println("Marca:" + marca);
        System.out.println("Tamano" + tamanho);
        System.out.println("Cor" + cor);
        System.out.println("estoque" + estoque);

    }
}