package tarefa;
//||
public class Tarefa implements Concluivel{

    public String descricao;
    public boolean concluida;
    public int prioridade;

    public Tarefa(String descricao, int prioridade){
        this.descricao = descricao;
        if (prioridade >= 1 && prioridade <=5){
            this.prioridade = 1;
        }
    }

    @Override
    public void concluir() {
        if (this.concluida == true){
            this.concluida = false;
        } else {
            this.concluida = true;
        }
    }

    @Override
    public boolean estaConcluida() {
        return concluida;
    }

    public void exibirStatus(){
        System.out.println("Descricao: " + descricao);
        System.out.println("Status: " + concluida);
        System.out.println("Prioridade: " + prioridade);
    }
}
