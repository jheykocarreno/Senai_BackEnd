public class Aluno {

    public String nome;
    public double nota;

    public void verificarStatus(double nota) {
        if (nota >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
