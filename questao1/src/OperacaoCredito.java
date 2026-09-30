
public abstract class OperacaoCredito {
    protected String cliente;
    protected double valorSolicitado;
    protected double jurosPrimeiroMes;

    public OperacaoCredito(String cliente, double valorSolicitado) {
        this.cliente = cliente;
        this.valorSolicitado = valorSolicitado;
    }

    public abstract String getModalidade();

    public abstract double getTaxaJuros();

    public abstract String getDocumentos();

    public void calcularJuros() {
        jurosPrimeiroMes = valorSolicitado * getTaxaJuros();
    }

    public void imprimirResumo() {
        System.out.println("Modalidade: " + getModalidade());
        System.out.println("Cliente: " + cliente);
        System.out.printf("Juros do primeiro mes: R$ %.2f%n", jurosPrimeiroMes);
        System.out.println("Documentos exigidos: " + getDocumentos());
        System.out.println("-------------------------");
    }
}
