//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Map<Integer, Produto > produtos = new HashMap<>();//Map, mapeamento de lista de produtos (Associação de chaves e valor: As chaves são únicas e os valores podem se repetir)
    produtos.put(101,new Produto("Macbook", 2.000,"Eletrônico"));// o metodo .put serve para adicionar ou atualizar um par de chave e valor dentro de um map
    produtos.put(102, new Produto("Mouse", 80.00, "Acessório"));
    produtos.put(103,new Produto("Tv Samsung", 3.000, "Casa-Eletrônico"));
    System.out.println(produtos.get(102));//.getNome é o metodo acessor para ler ou recuperar o valor de um atributo( no caso, o getNome)
    System.out.println(produtos.get(102).getNome());
    System.out.println(produtos.get(102).getPreco());
    System.out.println(produtos.containsKey(104));//.containsKey serve para verificar se a chave específica dentro do map é existente
    System.out.println(produtos.size());//. size serve para retornar a quantidade total de chaves valor dentro do map
    produtos.keySet();//Obtém: conjunto das chaves
    produtos.values(102);//Obtém: coleção dos valores
    produtos.entrySet();//Obtém: conjunto das entradas, cada um com chave e valor

    Cliente cliente = new Cliente("Lucas","São Vicente",12.000);
    Pedido produto = new Pedido(cliente);
    Pedido  = new Pedido(produto);


}
