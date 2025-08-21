package contaBancaria;

public class ContaBancaria implements OperacoesConta{

    public String numeroConta;
    private double saldo;
    boolean transferencia=true;

    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo){
            System.out.println("Saldo insuficiente");
            transferencia=false;
        } else {
            saldo -= valor;
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public void transferencia(ContaBancaria contaDest, double valor){
        if (numeroConta != contaDest.numeroConta){
            sacar(valor);
            if (transferencia){
                contaDest.depositar(valor);
            } else {
                System.out.println("Não é possivel fazer a transferencia.");
            }
        }
    }
}