import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ********************** VETORES (ARRAY) *************************

//        // 5 idades
//        int idade1 = 5;
//        int idade2 = 12;
//        int idade3 = 13;
//        int idade4 = 22;
//        int idade5 = 30;
//
//        // ARRAY - GUARDA UMA LISTA* DE COISAS
//        // Variavel que guarda uma lista de idades
//        // Todo Array tem um limite fixo de coisas
//        int[] idades = new int[5];
//        String[] nomes = new String[10];
//
//        // Endereços: 0 - 1 - 2 - 3 - 4
//        idades[0] = 12;
//        idades[1] = 20;
//        idades[2] = 30;
//        idades[3] = 40;
//        idades[4] = 50;
//
//        for(int i=0; i<idades.length; i++){
//            System.out.println("Idade" + (i+1) + " é " + idades[i]);
//        }
//
//        //Preencha o etor de nomes e liste todos os nomes com o for
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Preenche os nomes: ");
//
//        for(int i = 0; i < nomes.length; i++){
//            System.out.print("Nome" + (i+1) + ": ");
//            nomes[i] = sc.nextLine();
//        }
//        for(int i = 0; i < nomes.length; i++){
//            System.out.println("Nome" + (i+1) +  ": "+ nomes[i]);
//        }

//        //1. Crie e imprima um vetor
//        System.out.println("1. Crie e imprima um vetor");
//        int[] arr1 = new int[] {10,20,30,40,50};
//
//        for(int i=0; i<arr1.length; i++){
//            System.out.println("Arr" + i + " = " + arr1[i]);
//        }
//
//        //2. Preencher e listar 10 elementos
//        System.out.println("2. Preencher e listar 10 elementos");
//        String[] nomes = new String[10];
          Scanner sc = new Scanner(System.in);
//
//        System.out.println("Preenche os nomes: ");
//
//        for(int i = 0; i < nomes.length; i++){
//            System.out.print("Nome" + (i+1) + ": ");
//            nomes[i] = sc.nextLine();
//        }
//        for(int i = 0; i < nomes.length; i++){
//            System.out.println("Nome" + (i+1) +  ": "+ nomes[i]);
//        }
//
//        //3. Soma dos elementos do vetor
//        System.out.println("3. Soma dos elementos do vetor");
//        int[] vetor = new int[4];
//        vetor[0] = 10;
//        vetor[1] = 20;
//        vetor[2] = 30;
//        vetor[3] = 40;
//        int somaVetor=0;
//
//        for(int i = 0; i<vetor.length; i++){
//            somaVetor = somaVetor + vetor[i];
//        }
//
//        System.out.println("A soma total é: " + somaVetor);
//
//        //4. Encontre o maior valor
//        System.out.println("4. Encontre o maior valor");
//        int[] maior = new int[6];
//        int aux = 0;
//
//        for(int i = 0; i < maior.length; i++){
//            System.out.print("Digite o " + (i+1) + "º numero: ");
//            maior[i] = sc.nextInt();
//
//
//            if (maior[i] > aux){
//                aux = maior[i];
//            }
//        }
//
//        System.out.println("O numero maior digitado é: " + aux);

        //5. Contar números pares em um vetor
        System.out.println("5. Contar números pares em um vetor");

        int[] exer5 = new int[10];

        int[] pares = new int[10];
        int j=0;
        int contador=0;

        for (int i=0; i<exer5.length; i++){
            System.out.print("Digite numero: ");
            exer5[i] = sc.nextInt();

            if (exer5[i]%2 == 0){
                pares[j] = exer5[i];
                j++;
                contador++;
            }
        }

        for(int i=0; i<contador; i++){
            System.out.println(pares[i]);
        }
        System.out.println("Total de numeros pares é: " + (contador));

        //6. Buscar um valor no vetor
        System.out.println("6. Buscar um valor no vetor");

        System.out.println("Preenche 8 valores");

        for(int i = 0; i < nomes.length; i++){
            System.out.print("Valor" + (i+1) + ": ");
            nomes[i] = sc.nextLine();
        }

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Nome" + (i+1) +  ": "+ nomes[i]);
        }

    }
}