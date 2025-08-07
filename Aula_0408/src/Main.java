import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        //1. Senha simples
        Scanner sc = new Scanner(System.in);

        String senha = "1234";

        System.out.print("Ingresar sua senha: ");
        String senhaEntrada = sc.nextLine();

        if (senha.equals(senhaEntrada)){
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        //2. Número dentro de intervalo
        System.out.print("Ingresar um numero: ");
        int num1 = sc.nextInt();

        if (num1 >= 10 && num1 <=20){
            System.out.println("o numero " + num1 + ", esta dentro do rango 10 ao 20");
        } else {
            System.out.println("O numero " + num1 + " , esta fora do rando 10 ao 20");
        }

        //3. Par ou Ímpar
        System.out.print("Ingresar numero para saber se é par ou impar: ");
        int num2 = sc.nextInt();

        int resto = num2 % 2;

        if (resto == 0){
            System.out.println("O numero é PAR!");
        } else {
            System.out.println("O numero é IMPAR!");
        }

        //4. Maior entre dois números
        System.out.print("Ingresar o NUM1: ");
        int num3 = sc.nextInt();
        System.out.print("Ingresar o NUM2: ");
        int num4 = sc.nextInt();

        if (num3 > num4){
            System.out.println(num3 + " é maior que " + num4);
        } else if (num3 < num4){
            System.out.println(num3 + " é menor que " + num4);
        } else {
            System.out.println(num3 + " é igual que " + num4);
        }

        //5. Notas e conceito
        System.out.print("Ingresar sua nota: ");
        double nota = sc.nextDouble();

        if (nota >= 9.0){
            System.out.println("A");
        } else if (nota >= 7){
            System.out.println("B");
        } else if (nota >= 5){
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        //6. Verificador de ano bissexto
        System.out.print("Digite o ano para saber se é bissexto: ");
        int anoBis = sc.nextInt();

        if (anoBis % 4 == 0){
            if (anoBis % 100 == 0){
                if (anoBis % 400 == 0){
                    System.out.println("O ano é bissexto");
                } else {
                    System.out.println("Nãa é bissexto");
                }
            } else {
                System.out.println("O ano é bissexto");
            }
        } else {
            System.out.println("Não é bissexto");
        }

        //9. Contador até 10
        int num5 = 1;

        while (num5 <= 10){
            System.out.println(num5);
            num5++;
        }

        //10. Validador de senha com tentativas
        int tent = 3;
        boolean acesso = false;
        senha = "123";
        String senhaEnt;

        do {
            System.out.print("Ingresse sua senha: ");
            senhaEnt = sc.nextLine();

            if (senhaEnt.equals(senha)) {
                System.out.println("Acceso concedido!!!!!");
                acesso = true;
            } else {
                tent--;
                System.out.println("Tem mais " + tent + " tentativa. ");

                if (tent == 0) {
                    System.out.println("Acceso DENEGADO.... Bye");
                }
            }
        } while (!acesso == true && tent != 0);

    }
}