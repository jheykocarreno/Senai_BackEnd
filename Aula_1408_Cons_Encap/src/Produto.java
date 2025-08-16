// public class Nome
public class Produto {
    //1. Atributos
    // public Tipo nome
    public String nome;
    private double preco;
    private int estoque;

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

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
