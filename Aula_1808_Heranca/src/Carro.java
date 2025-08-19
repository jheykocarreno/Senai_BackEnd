public class Carro extends Veiculo{

    int numeroDePortas;

    public Carro(String marca, int numeroDePortas){
        super(marca);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas(){
        return numeroDePortas;
    }
}
