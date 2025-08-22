package cursos;

public class CursoPresencial extends Curso{

    String endereco;

    public CursoPresencial(String nome, int horas, String endereco){
        super(nome, horas);
        this.endereco = endereco;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("O endereço do curso: " + endereco);
    }
}
