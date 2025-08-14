// public class Nome
public class Produto {
    //1. Atributos
    // public Tipo nome
    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;

    //2. Metodos
    // Mostra informações do Produto
    // public static void mostrarInformacoes() {}
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }
}
