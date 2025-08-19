
public class Main {
    public static void main(String[] args) {

        Atleta jogador = new Atleta("Neymar Jr.", "Futebol");
        System.out.println("Nome: " + jogador.getNome()); // Herdado
        System.out.println("Esporte: " + jogador.getEsporte()); // Próprio

        Carro meuCarro = new Carro("Ford", 4);
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", 18);
        System.out.println("Carro: " + meuCarro.getMarca() + " com " + meuCarro.getNumeroDePortas() + " portas.");
        System.out.println("Bicicleta: " + minhaBicicleta.getMarca() + " com " + minhaBicicleta.getNumeroDeMarchas() + " marchas.");

        Gerente chefe = new Gerente("Roberto", 7500.0, "Vendas");
        System.out.println("Nome: " + chefe.getNome());
        System.out.println("Salário: R$" + chefe.getSalario());
        System.out.println("Departamento: " + chefe.getDepartamento());

        Livro meuLivro = new Livro("A Arte da Guerra", 29.99, "Sun Tzu");
        meuLivro.exibirDetalhes();


    }
}