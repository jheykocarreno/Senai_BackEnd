package gestaoDeColaboradores;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(String nome, double salario){
        super(nome, salario);
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salarioBase;
    }

    public void exibirDados(){
        super.exibirDados();
    }
}
