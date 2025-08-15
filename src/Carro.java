public class Carro {
    public Carro (String marca, String modelo, String cor, double motor, int ano, String descricao){
        this.cor = cor;
        this.descricao = descricao;
        this.motor = motor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;


    }




    public String marca;
    public String modelo;
    public String cor;
    public double motor;
    public int ano;
    public String descricao;

    public void mostrarInformacao (){
        System.out.println("marca:" + marca);
        System.out.println("modelo:" + modelo);
        System.out.println("preto:" + cor);
        System.out.println("motor:" + motor);
        System.out.println("ano:" + ano);
        System.out.println("descrição:" + descricao);



    }
}
