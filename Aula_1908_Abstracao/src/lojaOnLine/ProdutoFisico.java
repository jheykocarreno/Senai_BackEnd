package lojaOnLine;

public class ProdutoFisico implements Vendavel{

    public double preco;
    public double frete;

    public double precoFinal;

    public ProdutoFisico(double preco, double frete){
        this.preco = preco;
        this.frete = frete;
    }

    public double getPrecoFinal(){
        return precoFinal;
    }

    @Override
    public double calcularPrecoFinal() {
        precoFinal = preco + frete;
        return precoFinal;
    }
}
