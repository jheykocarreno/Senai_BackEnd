package gestaoDeColaboradores;

public class FuncionarioFreelancer extends Funcionario{
    public double valorHora;
    public int horasTrabalhadas;

    public FuncionarioFreelancer(String nome, double salarioBase, double valorHora, int horasTrabalhadas){
        super(nome, salarioBase);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        salarioBase = valorHora * horasTrabalhadas;
        return salarioBase;
    }

    @Override
    public void exibirDados() {
        calcularPagamento();
        super.exibirDados();
    }
}
