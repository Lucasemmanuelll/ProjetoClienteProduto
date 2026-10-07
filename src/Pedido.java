import java.util.ArrayList;
public class Pedido {

    ArrayList<Produto> produtos;
    private Cliente cliente;
    private Produto produto;

     Pedido(Cliente cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
         this.cliente = cliente;
    }
    public String getProduto() {
         return produto;
    }
    public void setProduto(Produto produto) {
         this.produto = produto;
    }

    public void AdicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public void RemoverProduto(Produto produto){
        produtos.remove(produto);
    }

    public void percorrerProduto(){
         for(int i = 0; i < produtos.size(); i++){
             produto = produtos.get(i);
         }
    }


    public void CalcularCréditoImovel(Produto produto){
            if(produto.getPreco() > cliente.getCredito()){
                throw new IllegalArgumentException(
                        "Crédito menor que " + getProduto()
                );
            }else{

            }

    }

    public void ExibirProduto(){
        System.out.println("Nome: " + this.produto.getNome());
        System.out.println("Preço: " + this.produto.getPreco());
        System.out.println("Categoria: " + this.produto.getCategoria());
    }

    public void ExibirPedido() {
        System.out.println("Categoria Cliente" + this.produto.getCategoria());
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Cidade: " + this.cliente.getCidade());
    }

}
