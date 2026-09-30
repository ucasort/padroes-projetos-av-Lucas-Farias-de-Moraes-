public class VoucherPortugal implements Voucher {

    @Override
    public String gerar(String hospede, String documentoHospede) {
        return "Voucher Portugal - hospede: " + hospede + " | NIF: " + documentoHospede;
    }
}
