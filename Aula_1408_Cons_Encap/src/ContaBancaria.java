public class ContaBancaria {

    public String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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

    public void exibirDados(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }


}
