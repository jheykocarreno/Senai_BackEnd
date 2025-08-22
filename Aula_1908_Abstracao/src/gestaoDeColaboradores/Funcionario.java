package gestaoDeColaboradores;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularPagamento(){
        return salarioBase;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salarioBase);
    }
}
