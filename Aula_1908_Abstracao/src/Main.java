import catalogoBiblioteca.ItemBiblioteca;
import catalogoBiblioteca.Livro;
import catalogoBiblioteca.Revista;
import contaBancaria.ContaBancaria;
import contaBancaria.OperacoesConta;
import formas.Circulo;
import formas.FormulaGeometrica;
import formas.Quadrado;
import gestaoDeColaboradores.Funcionario;
import gestaoDeColaboradores.FuncionarioCLT;
import gestaoDeColaboradores.FuncionarioFreelancer;
import lojaOnLine.ProdutoDigital;
import lojaOnLine.ProdutoFisico;
import lojaOnLine.Vendavel;
import produto.Exibivel;
import produto.Produto;
import tarefa.Concluivel;
import tarefa.Tarefa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FormulaGeometrica forma = new Quadrado(4);
        forma.CalcularArea();
        FormulaGeometrica forma2= new Circulo(6);
        forma2.CalcularArea();

        //1. Produto
        Exibivel prod1 = new Produto("Prod1", 10.5, "CatProd");
        prod1.exibirDetalhes();

        //2. Conta Bancária
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

        //3. Tarefa
        Concluivel tarefa1 = new Tarefa("Tarefa1", 5);
        tarefa1.concluir();
        tarefa1.exibirStatus();
        tarefa1.concluir();
        tarefa1.exibirStatus();
        System.out.println(tarefa1.estaConcluida());

        //4. Catálogo de Biblioteca
        ItemBiblioteca livro1 = new Livro("TitLiv1", 1900, "AutorLiv");
        ItemBiblioteca revista1 = new Revista("TitRev1", 1901, 1);
        livro1.exibirInfo();
        revista1.exibirInfo();
        ArrayList<ItemBiblioteca> biblioteca = new ArrayList<>();
        biblioteca.add(livro1);
        biblioteca.add(revista1);
        for (int i=0; i<biblioteca.size(); i++){
            System.out.println(biblioteca.get(i));
        }

        //5. Loja Online
        Vendavel prodFis1 = new ProdutoFisico(100.00 , 25.00);
        Vendavel prodDig1 = new ProdutoDigital(200.00 , 1025);

        System.out.println(prodFis1.calcularPrecoFinal());
        System.out.println(prodDig1.calcularPrecoFinal());

        ArrayList<Vendavel> arrVendavel = new ArrayList<>();

        arrVendavel.add(prodFis1);
        arrVendavel.add(prodDig1);
        double total = 0;

        for(int i=0; i<arrVendavel.size(); i++){
            total += arrVendavel.get(i).calcularPrecoFinal();
        }
        System.out.println(total);

        //6. Gestão de Colaboradores
        Funcionario funcClt1 = new FuncionarioCLT("NomeClt1", 1000.00);
        Funcionario funcFre1 = new FuncionarioFreelancer("NomeFree1", 0,89.00,20);

        funcClt1.exibirDados();
        funcFre1.exibirDados();

    }
}