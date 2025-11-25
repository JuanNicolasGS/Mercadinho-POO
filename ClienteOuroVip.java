public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public double calcularPagamento(){
        double desconto = getValorDaCompra() * 0.15;
        return getValorDaCompra() - desconto;
    }

    @Override
    public String toString() {
        return "\n= Cliente Ouro VIP = \nNome: " + getNome() + "\nValor do Pagamento: " + calcularPagamento() + "\nNúmero do cartão: " + getNumeroCartao() + "\nEndereço: " + endereco;
    }
}
