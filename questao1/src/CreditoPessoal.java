public class CreditoPessoal extends OperacaoCredito {

    public CreditoPessoal(String cliente, double valorSolicitado) {
        super(cliente, valorSolicitado);
    }

    @Override
    public String getModalidade() {
        return "Credito Pessoal";
    }

    @Override
    public double getTaxaJuros() {
        return 0.035;
    }

    @Override
    public String getDocumentos() {
        return "Documento de identidade, comprovante de renda";
    }
}
