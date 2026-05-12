public class Servico implements Vendavel{
    private float preco;
    private int garantiaEmMeses;
    private String descricao;

    Servico(float preco, int garantiaEmMeses, String descricao) {
        this.preco = preco;
        this.garantiaEmMeses = garantiaEmMeses;
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        return "Preco: " + preco + ", Meses de garantia: " + garantiaEmMeses + ", Descricao: " + descricao;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    private void setPreco(float preco) {
        this.preco = preco;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
