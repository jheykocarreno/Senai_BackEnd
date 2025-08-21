package catalogoBiblioteca;

public class Revista extends ItemBiblioteca{

    public int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao){
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao(){
        return edicao;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Edicao: " + edicao);
    }
}
