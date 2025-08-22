package cursos;

public class CursoOnline extends Curso{

    String linkAcesso;

    public CursoOnline(String nome, int horas, String linkAcesso){
        super(nome, horas);
        this.linkAcesso = linkAcesso;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Link do curso: " + linkAcesso);
    }
}
