public class FabricaBrasil implements FabricaArtefatosReserva {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NotaFiscalServico();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public Voucher criarVoucher() {
        return new VoucherBrasil();
    }
}
