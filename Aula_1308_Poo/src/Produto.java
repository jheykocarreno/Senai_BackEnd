// public class Nome
public class Produto {
    //1. Atributos
    // public Tipo nome
    public String nome;
    public double preco;
    public int estoque;

    public void adicionarEstoque(int qtd) {
        estoque += qtd;
    }

    public void realizarVenda(int qtd) {
        if (estoque < qtd) {
            System.out.println("Produto sem estoque suficiente");
        } else {
            estoque -= qtd;
        }
    }
}
