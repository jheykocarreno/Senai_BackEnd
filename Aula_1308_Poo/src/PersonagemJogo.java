public class PersonagemJogo {

    public String nome;
    public int nivel;
    public int pontosDeVida;


    public void receberDano(int dano){
        pontosDeVida-=dano;
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
