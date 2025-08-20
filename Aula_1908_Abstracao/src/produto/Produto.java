package produto;

public class Produto implements Exibivel{
    public String nome;
    public double preco;
    public String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Categoria: " + categoria);
    }
}
