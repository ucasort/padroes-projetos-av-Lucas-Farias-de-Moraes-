public class ConfirmacaoReserva {
    private FabricaArtefatosReserva fabrica;

    public ConfirmacaoReserva(FabricaArtefatosReserva fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(String hospede, String documentoHospede, double valorReserva) {
        ComprovanteFiscal comprovante = fabrica.criarComprovanteFiscal();
        Pagamento pagamento = fabrica.criarPagamento();
        Voucher voucher = fabrica.criarVoucher();

        System.out.println("=== Relatorio da reserva ===");
        System.out.println("Comprovante fiscal: " + comprovante.emitir(valorReserva));
        System.out.println("Pagamento: " + pagamento.processar(valorReserva));
        System.out.println("Voucher: " + voucher.gerar(hospede, documentoHospede));
        System.out.println();
    }
}
