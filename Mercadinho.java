public class Mercadinho {
    private Cliente[] clientes;
    private int quantidade;
    
    public Mercadinho() {
        clientes = new Cliente[10];
        quantidade = 0;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarCliente(Cliente cliente){
        if (quantidade < clientes.length){
            clientes[quantidade] = cliente;
            quantidade++;
        } 
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += clientes[i].calcularPagamento();
        }
        return total;
    }

    public void imprimirClientes(){
        for(int i = 0; i < quantidade; i++){
            System.out.println(clientes[i]);
        }
    }
}
