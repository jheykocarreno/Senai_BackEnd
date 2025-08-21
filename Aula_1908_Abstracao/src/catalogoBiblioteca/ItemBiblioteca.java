package catalogoBiblioteca;

public class ItemBiblioteca {

    protected String titulo;
    protected int anoPublicacao;

    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void exibirInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano publicacao: " + anoPublicacao);
    }

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
