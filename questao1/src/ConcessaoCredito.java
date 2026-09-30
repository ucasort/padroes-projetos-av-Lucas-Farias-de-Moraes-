public abstract class ConcessaoCredito {

    protected abstract OperacaoCredito criarOperacao(String cliente, double valorSolicitado);

    public final void conceder(String cliente, double valorSolicitado) {
        OperacaoCredito operacao = criarOperacao(cliente, valorSolicitado);
        operacao.calcularJuros();
        operacao.imprimirResumo();
    }
}
