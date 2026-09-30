public class CreditoImobiliario extends OperacaoCredito {

    public CreditoImobiliario(String cliente, double valorSolicitado) {
        super(cliente, valorSolicitado);
    }

    @Override
    public String getModalidade() {
        return "Credito Imobiliario";
    }

    @Override
    public double getTaxaJuros() {
        return 0.008;
    }

    @Override
    public String getDocumentos() {
        return "Matricula do imovel, comprovante de renda";
    }
}
