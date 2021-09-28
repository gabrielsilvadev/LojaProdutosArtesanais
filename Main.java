public class Main {
    public static void main(String[] args){
        Loja Cucas = new Loja("Cucas");
        Produto p = new Produto.BuildProdutos().name("mouse").preco("100").quantidade("12").descricao("Mause gamer").categoria("tecnologia").criaProdutos();
        Produto p1 = new Produto.BuildProdutos().name("arroz").preco("100").quantidade("12").descricao("Mause gamer").categoria("alimento").criaProdutos();
        Produto p2 = new Produto.BuildProdutos().name("bike").preco("100").quantidade("12").descricao("Mause gamer").categoria("lazer").criaProdutos();
        Produto p3 = new Produto.BuildProdutos().name("mouse").preco("100").quantidade("12").descricao("Mause gamer").categoria("tecnologia").criaProdutos();
     
        Cucas.addProduto(p);   
        Cucas.addProduto(p1);   
        Cucas.addProduto(p2);   
        Cucas.addProduto(p3); 
        
        Cucas.verProdutos();  
    } 
}
