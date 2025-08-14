public class Main {
    public static void main(String[] args) {

        //Instanciar a classe
        Produto prod1 = new Produto();

        prod1.marca = "Dell";
        prod1.cor = "Preto";
        prod1.nome = "Notebook";

        //1. Criando a Classe Musica (Apenas Atributos)
        Musica musica = new Musica();
        musica.titulo = "Bohemian Rhapsody";
        musica.artista = "Queen";
        musica.duracaoEmSegundos = 355;

        System.out.println("Tocando agora " + musica.titulo + " do artista " + musica.artista);

        //2. Criando a Classe Carro com um Método Simples
        Carro carro = new Carro();
        carro.marca = "Dodge";
        carro.modelo = "Jorney";
        carro.ano = 2019;

        carro.exibirInformacoes();

        //3. Criando a Classe Aluno com Lógica Simples
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Carlos";
        aluno1.nota = 6.0;
        aluno1.verificarStatus(aluno1.nota);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        aluno2.nota = 4.9;
        aluno2.verificarStatus(aluno2.nota);

        //4. Gerenciando uma ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.titular = "Juliana";
        minhaConta.saldo = 1000.0;

        minhaConta.depositar(500.0);
        System.out.println("Novo saldo: " + minhaConta.saldo);

        minhaConta.sacar(200.0);
        System.out.println("Saldo após saque: " + minhaConta.saldo);

        minhaConta.sacar(1500.0); // Tentativa de saque maior que o saldo
        System.out.println("Saldo final: " + minhaConta.saldo);

        //5. Controlando o Estoque de um Produto


    }
}