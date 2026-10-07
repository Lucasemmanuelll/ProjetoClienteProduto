public class Cliente {


    private String nome;
    private String cidade;
    private double credito;

    public Cliente(String nome, String cidade, double credito) {
        this.nome = nome;
        this.cidade = cidade;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
        public void mostrarCliente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Credito: " + this.credito);
        }
}
