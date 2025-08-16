public class Main {
    public static void main(String[] args) {
        //1. Refatorando a Classe Musica com um Construtor
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);
        System.out.println("Tocando agora " + musica.titulo + " do artista " + musica.artista);

        //2. Refatorando a Classe Carro com um Construtor
        Carro carro = new Carro(1969, "Ford", "Mustang");
        carro.exibirInformacoes();

        //3. Refatorando a Classe Aluno com um Construtor
        Aluno aluno1 = new Aluno("Carlos", 8.5);
        aluno1.verificarStatus();

        Aluno aluno2 = new Aluno("Ana", 4.0);
        aluno2.verificarStatus();

        //4. Gerenciando uma ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.titular = "Juliana";
        minhaConta.setSaldo(1000.0);

        minhaConta.depositar(500.0);
        System.out.println("Novo saldo: " + minhaConta.getSaldo());

        minhaConta.sacar(200.0);
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());

        minhaConta.sacar(1500.0); // Tentativa de saque maior que o saldo
        System.out.println("Saldo final: " + minhaConta.getSaldo());

        //5. Controlando o Estoque de um Produto
        Produto notebook = new Produto("Notebook Gamer", 4500.0, 10);
        System.out.println("Preço inicial: " + notebook.getPreco());

        notebook.setPreco(-50); // Tentativa de definir um preço inválido
        notebook.setPreco(4200.0); // Definindo um preço válido
        System.out.println("Novo preço: " + notebook.getPreco());

        //6. Criando um PersonagemJogo
        PersonagemJogo heroi = new PersonagemJogo("Aragorn", 5, 100);
        heroi.exibirStatus();

        heroi.receberDano(150);
        heroi.subirDeNivel();

        System.out.println("Após a batalha");
        heroi.exibirStatus();
    }
}