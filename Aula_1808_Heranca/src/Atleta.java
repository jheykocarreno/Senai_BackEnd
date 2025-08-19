public class Atleta extends Pessoa{
    String esporte;

    public Atleta(String nome, String esporte){
        super(nome);
        this.esporte = esporte;
    }

    public String getEsporte() {
        return esporte;
    }
}
