public class ClienteVip extends Cliente {
    public String numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao) {
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }
    

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public double calcularPagamento(){
        double desconto = getValorDaCompra() * 0.1;
        return getValorDaCompra() - desconto;
    }

    @Override
    public String toString() {
        return "\n= Cliente VIP = \nNome: " + getNome() + "\nValor do Pagamento: " + calcularPagamento() + "\nNúmero do cartão: " + numeroCartao;
    }
}
