package catalogoBiblioteca;

public class Livro extends ItemBiblioteca{

    public String autor;

    public Livro(String titulo, int anoPublicacao, String autor){
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Autor: " + autor);
    }


}
