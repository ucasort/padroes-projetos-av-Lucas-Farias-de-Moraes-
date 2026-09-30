public class PagamentoMbWay implements Pagamento {

    @Override
    public String processar(double valorReserva) {
        return String.format("Pagamento via MB WAY de EUR %.2f", valorReserva);
    }
}
