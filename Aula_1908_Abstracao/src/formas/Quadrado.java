package formas;

public class Quadrado implements FormulaGeometrica{
    public double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public void CalcularArea() {
        double area = lado * lado;
        System.out.println(area);
    }
}
