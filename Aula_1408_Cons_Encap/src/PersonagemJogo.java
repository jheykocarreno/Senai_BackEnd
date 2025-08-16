public class PersonagemJogo {

    private String nome;
    private int nivel;
    private int pontosDeVida;

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public PersonagemJogo (String nome, int nivel, int pontosDeVida) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
    }

    public void receberDano(int dano){
        if (dano >= pontosDeVida){
            pontosDeVida = 0;
        } else {
            pontosDeVida -= dano;
        }
    }

    public void subirDeNivel(){

        nivel++;
    }
    public void exibirStatus(){
        System.out.println("Nome: " + nome);
        System.out.println("Nivel: " + nivel);
        System.out.println("Pontos de vida: " + pontosDeVida);
    }

}
