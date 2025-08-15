public class Carro {

    public int ano;
    public String marca;
    public String modelo;

    public Carro(int ano, String marca, String modelo){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
