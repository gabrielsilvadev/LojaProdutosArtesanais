// na criaçao da instacia de cad aproduot foi usada o padrao build para especificar os parametros para o construtor 
public class Produto {
    private String name;
    private String categoria;
    private String descricao;
    private String preço;
    private String quantidade;

    private Produto(String name, String categoria, String descricao, String preço, String quantidade) {
        this.name = name;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preço = preço;
        this.quantidade = quantidade;

    }

    public static class BuildProdutos {
        private String name;
        private String categoria;
        private String descricao;
        private String preço;
        private String quantidade;

        public BuildProdutos name(String name) {
            this.name = name;
            return this;
        }

        public BuildProdutos categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public BuildProdutos descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public BuildProdutos preco(String preco) {
            this.preço = preço;
            return this;
        }

        public BuildProdutos quantidade(String quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public Produto criaProdutos(){
           return new Produto(name, categoria, descricao, preço, quantidade);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preço;
    }

    public void setPreco(String preco) {
        this.preço = preço;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
