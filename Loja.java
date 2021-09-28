import java.util.ArrayList;
// Nessa parte foi usado o padroa compose para manipular o array de produtos 
public class Loja {
  private ArrayList<Produto> Produtos;
  public String nome; 

  public Loja(String nome){
    this.nome = nome;
    this.Produtos = new ArrayList<Produto>();
  }
  public void addProduto(Produto produto){
     this.Produtos.add(produto);
  }
  public void removeProduto(Produto produto){
     this.Produtos.remove(produto);
  }
  public void verProdutos(){
     this.Produtos.forEach( (produto) -> {
        System.out.println(produto.getName() + " (" + produto.getCategoria() + ")");
     });
  }
  
  
}
