public class Pedido {


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

    public void CategoriaCliente() {
        System.out.println("Categoria Cliente" + this.);
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Cidade: " + this.cliente.getCidade());
    }

}
