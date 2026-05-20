import java.math.BigDecimal;

public class Produto implements Vendavel {
    private BigDecimal preco;
    private String marca;
    private String descricao;

    Produto(BigDecimal preco, String marca, String descricao) {
        this.preco = preco;
        this.marca = marca;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Preco: " + preco + ", Marca: " + marca + ", Descricao: " + descricao;
    }

    @Override
    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    private void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
