public class ContaBancaria{

    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo = saldo - valor;
        } else{
            System.out.println("Saldo insuficiente!!!");
        }
    }
}
