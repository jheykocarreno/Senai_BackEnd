package cursos;

public class Curso {

    protected String nome;
    protected int duracaoHoras;

    public Curso(String nome, int duracaoHoras){
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Duracao em horas: " + duracaoHoras);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                '}';
    }
}
