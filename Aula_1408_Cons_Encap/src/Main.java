public class Main {
    public static void main(String[] args) {
        //1. Refatorando a Classe Musica com um Construtor
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);
        System.out.println("Tocando agora " + musica.titulo + " do artista " + musica.artista);

        //2. Refatorando a Classe Carro com um Construtor
        Carro carro = new Carro(1969, "Ford", "Mustang");
        carro.exibirInformacoes();

        //3. Refatorando a Classe Aluno com um Construtor
        Aluno aluno1 = new Aluno("Carlos", 6.0);
        aluno1.verificarStatus(aluno1.nota);
    }
}