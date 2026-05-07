public class Produto {
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

    public float getPreco() {
        return preco;
    }

    private void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
