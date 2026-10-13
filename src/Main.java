//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Map<Integer, Produto > produtos = new HashMap<>();
    produtos.put(1,new Produto("Macbook", 2.000,"Eletrônico"));
    produtos.put(2, new Produto("Mouse", 80.00, "Acessório"));
    produtos.put(3,new Produto("Tv Samsung", 3.000, "Casa-Eletrônico"));

    System.out.println(produtos.get(1).getNome());
    System.out.println(produtos.size());
    System.out.println(produtos.containsKey(2));

    Cliente cliente = new Cliente("Lucas","São Vicente",12.000);
    Pedido produto = new Pedido(cliente);
    Pedido  = new Pedido(produto);


}
