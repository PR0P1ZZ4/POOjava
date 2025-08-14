public class Produto {
// public class nome {}
// 1. atributo quais sao
    // public TIPO nome;
    //tamanho, preço, cor, unidade, marca e nome
    public String nome;
    public double preço;
    public double tamanho;
    public String marca;
    public String cor;
    public int unidade;

    // 2. metodos quais sao
    // Mostra ações do Produto
    public void mostrarInformacoes () {
        System.out.println("Nome:" + nome);
        System.out.println("Preço:" + preço);
        System.out.println("Marca:" + marca);
        System.out.println(tamanho);
        System.out.println(cor);

  }
}