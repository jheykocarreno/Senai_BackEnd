import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("-------------------- MENU --------------------");
            System.out.println("1. Exibir uma mensagem de boas-vindas");
            System.out.println("2. Mostrar o dobro de um número");
            System.out.println("3. Retornar a divisão de dois números inteiros");
            System.out.println("4. Verificar se um número é par");
            System.out.println("5. Calcular média de três notas");
            System.out.println("6. Mostrar uma linha decorativa");
            System.out.println("7. Verificar se uma palavra é palíndromo");
            System.out.println("8. Gerar um array com números primos");
            System.out.println("9. Calcular fatorial com recursão");
            System.out.println("0. Sair!!!");

            option = sc.nextInt();

            if  (option == 0) {
                System.out.println("Obrigado!!!! Tchau");
                break;
            } else if  (option == 1) {
                //1. Exibir uma mensagem de boas-vindas
                boaNoite();
                saudar("Jheyko");
            } else if  (option == 2) {
                System.out.print("Digitar numero para calcular o dobro: ");
                int num1 = sc.nextInt();
                dobro(num1);
            } else if  (option == 3) {
                System.out.print("Digitar dividendo: ");
                int num2 = sc.nextInt();
                System.out.print("Digitar divisor: ");
                int num3 = sc.nextInt();
                System.out.println("Resultado da divisao: " + divisao(num2, num3));
            } else if  (option == 4) {
                System.out.print("Digitar numero para saber se é par: ");
                int numPar = sc.nextInt();
                if (ehPar(numPar) == true){
                    System.out.println("É numero PAR");
                } else {
                    System.out.println("É numero IMPAR");
                }
            } else if  (option == 5) {
                System.out.print("Digite a Primeira nota: ");
                double nota1 = sc.nextDouble();
                System.out.print("Digite a Segunda nota: ");
                double nota2 = sc.nextDouble();
                System.out.print("Digite a Terceira nota: ");
                double nota3 = sc.nextDouble();

                System.out.println("A media é: " + calcularMedia(nota1, nota2, nota3));
            } else  if  (option == 6) {
                linha();
            } else if (option == 7) {
                System.out.printf("Digite a palavra: ");
                String palavra = sc.nextLine().toLowerCase();

                if (palindromo(palavra)) {
                    System.out.println("A palavra " + palavra + " é PALINDROMO!");
                } else {
                    System.out.println("A palavra " + palavra + " Náo é palindromo!");
                }
            } else if (option == 8) {
                System.out.println("Digite a quantidade de primos: ");
                //gerarPrimos(sc.nextInt());
                System.out.println(gerarPrimos(sc.nextInt()));
            } else if  (option == 9) {
                System.out.println("Digite a segunda nota: ");
            } else {
                System.out.println("Digite novamente a Opcão: ");
            }


        } while (option != 0);
    }

    //1. Exibir uma mensagem de boas-vindas
    public static void boaNoite(){
        System.out.print("Boa noite, ");
    }

    public static void saudar(String nome){
        System.out.println("tudo bem " + nome);
    }

    //2. Mostrar o dobro de um número
    public static void dobro(int num1){
        System.out.println(2 * num1);
    }

    //3. Retornar a divisão de dois números inteiros
    public static double divisao(int a, int b){
        return (double) a/b;
    }

    //4. Verificar se um número é par
    public static boolean ehPar(int numPar){
        if ((numPar%2) == 0){
            return true;
        } else {
            return false;
        }
    }

    //5. Calcular média de três notas
    public static double calcularMedia(double not1, double not2, double not3){
        return (not1 + not2 + not3) / 3;
    }

    //6. Mostrar uma linha decorativa

    public static void linha(){
        for (int i = 0; i < 30; i++){
            System.out.print("-");
        }
        System.out.println("");
    }

    //7. Verificar se uma palavra é palíndromo
    public static boolean palindromo(String palavra){
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

    //8. Gerar um array com números primos
    public static int[] gerarPrimos(int n){
        int resto;
        int contador=0;
        boolean ePrimo = true;
        int[] primos = new int[n];

        for(int i = 1; i <= n; i++){
            ePrimo = true;

            for(int j = 2; j < i; j++) {
                resto = i % j;

                if (resto == 0) {
                    ePrimo = false;
                    j = i;
                }
            }

            if (ePrimo) {
                primos[contador] = i;
                contador++;
            }
        }
        return primos;
    }

}