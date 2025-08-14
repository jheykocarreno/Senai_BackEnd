public class Main {
    public static void main(String[] args) {

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
        Produto notebook = new Produto();
        notebook.nome = "Notebook Gamer";
        notebook.preco = 4500.00;
        notebook.estoque = 10;

        notebook.adicionarEstoque(5); // Chegaram mais 5
        System.out.println("Estoque atual: " + notebook.estoque);

        notebook.realizarVenda(8);
        System.out.println("Estoque após venda: " + notebook.estoque);

        notebook.realizarVenda(10);

        //6. Criando um PersonagemJogo
        PersonagemJogo heroi = new PersonagemJogo();
        heroi.nome = "Aragorn";
        heroi.nivel = 5;
        heroi.pontosDeVida = 100;

        heroi.exibirStatus();

        heroi.receberDano(25);
        heroi.subirDeNivel();

        System.out.println("Após a batalha");
        heroi.exibirStatus();
    }
}