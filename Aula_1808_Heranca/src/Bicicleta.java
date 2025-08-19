public class Bicicleta extends Veiculo{

    int numeroDeMarchas;

    public Bicicleta (String marca, int numeroDeMarchas){
        super(marca);
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }
}
