package formas;

public class Circulo implements FormulaGeometrica{

    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void CalcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println(area);
    }
}
