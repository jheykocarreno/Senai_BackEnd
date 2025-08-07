import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1 - Contagem
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);

            if (i == 10){
                System.out.println("TEMPOOOOO!!!!");
            }
        }

        //2 - Tabuada de multiplicacao
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para a tabuada: ");

        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        //3 - Cálculo de Fatorial
        System.out.print("Digite um numero positivo: ");
        int number = sc.nextInt();

        if (number < 0){
            System.out.println("Tem que ser positivo!!!!!");
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }

        System.out.println("O factorial do numero " + number + " é: " + factorial);

        //4 - Encontrando Números Primos
        int resto;
        boolean ePrimo = true;

        for(int i = 1; i < 100; i++){
            ePrimo = true;

            for(int j = 2; j < i; j++) {
                resto = i % j;

                if (resto == 0) {
                    ePrimo = false;
                    j = i;
                }
            }

            if (ePrimo) {
                System.out.println("O numero " + i + " e primo");
            }
        }

        //---------- EXTRAS ----------
        //1. Contagem regresiva
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }

        //2. Média de notas

    }
}