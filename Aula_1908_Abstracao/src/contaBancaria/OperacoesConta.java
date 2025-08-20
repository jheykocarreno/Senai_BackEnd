package contaBancaria;

public interface OperacoesConta {

    void depositar(double valor);

    void sacar(double valor);

    double consultarSaldo();

    //void transferencia(ContaBancaria conta, double valor);

}
