public class Aluno {

    public String nome;
    public double nota;

    public Aluno(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public void verificarStatus() {
        if (nota >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }


}
