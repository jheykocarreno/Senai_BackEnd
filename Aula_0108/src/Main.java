import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Verificador de Maioridade
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a idade: ");
        int idade = sc.nextInt();

        if (idade > 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade");
        }

        //2. Verificador de Número (Positivo, Negativo ou Zero)
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo!");
        } else if (numero < 0){
            System.out.println("O número é negativo!");
        } else {
            System.out.println("O número é ZERO");
        }

        //3. Classificação de Aluno
        System.out.print("Digite sua nota: ");

        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado!!!!");
        } else {
            System.out.println("Reprovado :(");
        }

        //4. Status de Tarefa
        boolean tarefaConcluida = true;

        if (tarefaConcluida == true) {
            System.out.println("A tarefa foi finalizada com sucesso!");
        } else {
            System.out.println("A tarefa está pendente!");
        }

        //5. Permissão para Entrar na Festa
        System.out.println("Bora pra festa!!!!!");
        int idadeFesta;
        boolean acompanhante = false;

        System.out.println("Qual é sua idade?");
        idadeFesta = sc.nextInt();

        if (idadeFesta >= 18){
            System.out.println("Entrada permitida");
        } else if (idadeFesta  >= 16) {
            System.out.println("Voce bem com acompanhante????: True/False");
            acompanhante = sc.nextBoolean();

            if (acompanhante == true){
                System.out.println("Entrada permitida com acompanhante");
            }
        } else {
            System.out.println("Entrada negada");
        }

        //6. Aprovação de Empréstimo
        double salarioMensal;
        boolean possuiRestricao;

        System.out.print("Ingrese salario: ");
        salarioMensal = sc.nextDouble();

        System.out.println("Possui restricao");
        possuiRestricao = sc.nextBoolean();

        if ( salarioMensal >= 2000 && possuiRestricao == false) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo negado");
        }

        //7. Classificação de Média Escolar Completa
        System.out.print("Digite sua nota: ");

        double nota2 = sc.nextDouble();

        if (nota2 >= 7.0) {
            System.out.println("Aprovado!!!!");
        } else if (nota2 > 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        //8. Par ou Ímpar com Operador Ternário



    }
}