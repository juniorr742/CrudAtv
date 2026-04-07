import java.util.ArrayList;

public class Produto {

    private String nomeProduto;
        private int quantidade;
        private double preco;



    public Produto(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }


    @Override
    public String toString(){
        return "name " + this.nomeProduto + "Quantidade: " + this.quantidade + "Preço: " + this.preco;
    }
}
