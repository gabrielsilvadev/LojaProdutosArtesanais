public class Main {
    public static void main(String[] args){
        Loja Cucas = new Loja("Cucas Bebidas Artesanais");
        Produto Cachaça = new Produto.BuildProdutos().name("Cachaça raiz da chapada").preco("100").quantidade("12").descricao("Cachaça da regiao").categoria("bebidas").criaProdutos();
        Produto Cerveja = new Produto.BuildProdutos().name("Cerveja curatos").preco("40").quantidade("12").descricao("Cerveja artesanal de Barbalha").categoria("bebidas").criaProdutos();
       
        Cucas.addProduto(Cachaça);   
        Cucas.addProduto(Cerveja);   
        
        Cucas.verProdutos();  
    } 
}
