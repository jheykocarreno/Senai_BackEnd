public class Livro extends Produto{

    public String autor;

    public Livro(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Autor: " + autor);
    }
}
