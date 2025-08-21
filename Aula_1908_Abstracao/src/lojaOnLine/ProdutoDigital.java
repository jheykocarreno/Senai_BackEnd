package lojaOnLine;

public class ProdutoDigital implements Vendavel{

    double preco;
    int tamanhoArquivoMB;
    public double precoFinal;

    public ProdutoDigital(double preco, int tamanhoArquivoMB){
        this.preco = preco;
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public double getPrecoFinal(){
        return precoFinal;
    }

    @Override
    public double calcularPrecoFinal() {
        if(tamanhoArquivoMB >= 1024){
            precoFinal = preco - (preco * 0.25);
            return precoFinal;
        } else if(tamanhoArquivoMB >= 512){
            precoFinal = preco - (preco * 0.125);
            return precoFinal;
        } else {
            precoFinal = preco;
            return preco;
        }
    }
}
