import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String senha = "1234";
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresse sua senha: ");
        String senhaEntrada = sc.nextLine();

        if (senhaEntrada.equals(senha)) {
            System.out.println("Acceso concedido!!!!!");

        } else {
            while (!senha.equals(senhaEntrada)) {
                System.out.print("Tente novamente: ");
                senhaEntrada = sc.nextLine();
            }

            System.out.println("Acceso concedido!!!!!");
        }

        //Esqueva um programa que imprima a mensagem "Executando o processo..."
        //em seguida, perguntamos ao usuario se ele deseja executar o processo
        //novamente. Se o usuario digitar 's' ou 'S', o processo se repete. Caso
        //contrario, o programa é encerrado. O do-while é idear aqui, pois o
        //processo sempre executa pelo menos uma vez.

        boolean fim = false;

        System.out.println("Executando o processo...");

        do{
            System.out.print("Deseja executar o processo novamente? S/N: ");
            String sN = sc.nextLine();

            if (!sN.toUpperCase().equals("S") && !sN.toUpperCase().equals("N")){
                System.out.println("Somente S ou N");
            }else {
                if (!sN.toUpperCase().equals("S")) {
                    fim = true;
                }
            }

        } while (fim != true);

        System.out.println("Processo FINALIZADO...");
    }
}