public class Principal {
    public static void main(String[] args) {
        Mercadinho jet = new Mercadinho();
        jet.adicionarCliente(new ClienteRegular("Juan", 19.90));
        jet.adicionarCliente(new ClienteVip("José", 199.80, "5464-8182-1050-123"));
        jet.adicionarCliente(new ClienteOuroVip("Maria", 2358.19, "1657-1985-9057-846", "Bairro da Glória"));

        jet.imprimirClientes();
        System.out.println("\n= Total de compras * clientes =\n" + jet.calcularTotal());
    }
}
