public class VoucherBrasil implements Voucher {

    @Override
    public String gerar(String hospede, String documentoHospede) {
        return "Voucher Brasil - hospede: " + hospede + " | CPF: " + documentoHospede;
    }
}
