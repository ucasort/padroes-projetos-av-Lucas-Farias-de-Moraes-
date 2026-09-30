public class FabricaPortugal implements FabricaArtefatosReserva {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new FaturaPortugal();
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoMbWay();
    }

    @Override
    public Voucher criarVoucher() {
        return new VoucherPortugal();
    }
}
