public class CreditoConsignado extends OperacaoCredito {

    public CreditoConsignado(String cliente, double valorSolicitado) {
        super(cliente, valorSolicitado);
    }

    @Override
    public String getModalidade() {
        return "Credito Consignado";
    }

    @Override
    public double getTaxaJuros() {
        return 0.018;
    }

    @Override
    public String getDocumentos() {
        return "Contracheque ou extrato de beneficio";
    }
}
