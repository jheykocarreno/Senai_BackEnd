import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Exercícios Fundamentais
        //1. Exibir uma Mensagem
        System.out.println("Olá, mundo!");

        //2. Declarar e Usar uma Variável
        int numero = 10;
        System.out.println(numero);

        //3. Fazer uma Soma
        int a = 5;
        int b = 3;
        System.out.println(a+b);

        //4. Produto de dois números
        int num1 = 8;
        int num2 = 7;
        System.out.println(num1 * num2);

        //Exercícios Intermediários
        //5. Saudação Personalizada
        String nome = "Ana";
        System.out.println("Olá, " + nome + "!");

        //6. Calcular o Dobro
        int valor = 16;
        System.out.println(2 * valor);

        //7. Média de três números
        double x = 10;
        double y = 15;
        double z = 25;
        double media = (x + y + z) / 3;
        //double media = (double)(x + y + z) / 3;
        System.out.println(media);

        //8. Comparar Dois Números
        int x1 = 10;
        int y2 = 20;

        System.out.println(x1 < y2);

        //Exercícios Avançados
        //9. Verificação de Idade para Votar
        Scanner sc = new Scanner(System.in);
        System.out.println("Digitar sua idade: ");
        int idade = sc.nextInt();

        System.out.println(idade > 16);

        //10. Usando o Operador Lógico "E" (&&)
        int temperatura = 28;

        System.out.println(temperatura > 25 && temperatura < 30);

        //11. Usando o Operador Lógico "OU" (||)
        boolean temCartao = true;
        double compra = 50.0;

        System.out.println(temCartao == true || compra > 100);
    }
}