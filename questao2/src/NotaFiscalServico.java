public class NotaFiscalServico implements ComprovanteFiscal {

    @Override
    public String emitir(double valorReserva) {
        double iss = valorReserva * 0.05;
        return String.format("NFS-e | valor R$ %.2f | ISS 5%%: R$ %.2f", valorReserva, iss);
    }
}
