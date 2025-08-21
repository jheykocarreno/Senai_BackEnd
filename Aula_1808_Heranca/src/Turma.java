public class Turma extends Aluno{

    String nomeDaTurma;
    int capacidade;
    int alunoAtual;

    public Aluno[] arrAluno;

    public Turma(String nomeDaTurma, int capacidade){
        super("");
        this.nomeDaTurma = nomeDaTurma;
        this.capacidade = capacidade;
        arrAluno = new Aluno[capacidade];
    }

    public void adicionarAluno(Aluno aluno){
        arrAluno[alunoAtual] = aluno;
        alunoAtual++;
    }

    @Override
    public String toString() {
        return "Oi";
    }

    public void listarAlunos(){
        for (int i = 0; i < arrAluno.length; i++){
            if(arrAluno[i].getNome() != null){
                System.out.println("- " + arrAluno[i].getNome());
            } else {
                i = arrAluno.length;
            }
        }
    }
}
