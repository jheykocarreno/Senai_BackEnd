package contaBancaria;

public class ContaBancaria implements OperacoesConta{

    String numeroConta;
    double saldo;

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
            contaDest.depositar(valor);
        }
    }
}