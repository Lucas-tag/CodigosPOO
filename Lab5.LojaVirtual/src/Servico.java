import java.math.BigDecimal;

public class Servico implements Vendavel{
    private BigDecimal preco;
    private int garantiaEmMeses;
    private String descricao;



    Servico(BigDecimal preco, int garantiaEmMeses, String descricao) {
        this.preco = preco;
        this.garantiaEmMeses = garantiaEmMeses;
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "Preco: " + preco + ", Meses de garantia: " + garantiaEmMeses + ", Descricao: " + descricao;
    }

    @Override
    public BigDecimal getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    private void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
