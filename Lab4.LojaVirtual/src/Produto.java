public class Produto implements Vendavel {
    private float preco;
    private String marca;
    private String descricao;

    Produto(float preco, String marca, String descricao) {
        this.preco = preco;
        this.marca = marca;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Preco: " + preco + ", Marca: " + marca + ", Descricao: " + descricao;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    private void setPreco(float preco) {
        this.preco = preco;
    }
}
