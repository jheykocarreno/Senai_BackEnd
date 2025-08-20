import contaBancaria.ContaBancaria;
import contaBancaria.OperacoesConta;
import formas.Circulo;
import formas.FormulaGeometrica;
import formas.Quadrado;
import produto.Exibivel;
import produto.Produto;

public class Main {
    public static void main(String[] args) {

        FormulaGeometrica forma = new Quadrado(4);
        forma.CalcularArea();
        FormulaGeometrica forma2= new Circulo(6);
        forma2.CalcularArea();


        Exibivel prod1 = new Produto("Prod1", 10.5, "CatProd");
        prod1.exibirDetalhes();


        ContaBancaria conta1 = new ContaBancaria("001", 100.00);
        conta1.depositar(200.00);
        conta1.consultarSaldo();
        conta1.sacar(400.00);
        conta1.consultarSaldo();
        conta1.sacar(50.00);
        System.out.println(conta1.consultarSaldo());

        ContaBancaria conta2 = new ContaBancaria("002", 50.00);
        conta1.transferencia(conta2, 10);
        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());


    }
}