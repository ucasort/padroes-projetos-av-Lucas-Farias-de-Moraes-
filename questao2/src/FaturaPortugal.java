public class FaturaPortugal implements ComprovanteFiscal {

    @Override
    public String emitir(double valorReserva) {
        double iva = valorReserva * 0.06;
        return String.format("Fatura | valor EUR %.2f | IVA 6%%: EUR %.2f", valorReserva, iva);
    }
}
