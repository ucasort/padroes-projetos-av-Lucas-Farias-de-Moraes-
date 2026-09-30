public class PagamentoPix implements Pagamento {

    @Override
    public String processar(double valorReserva) {
        return String.format("Pagamento via Pix de R$ %.2f", valorReserva);
    }
}
