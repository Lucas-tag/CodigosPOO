public class Servico {
    private float preco;
    private int garantiaEmMeses;
    private String descricao;

    Servico(float preco, int garantiaEmMeses, String descricao) {
        this.preco = preco;
        this.garantiaEmMeses = garantiaEmMeses;
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    private void setPreco(float preco) {
        this.preco = preco;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
