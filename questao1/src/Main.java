public class Main {
    public static void main(String[] args) {
    
        ConcessaoCredito concessaoPessoal = new ConcessaoCreditoPessoal();
        concessaoPessoal.conceder("Joao Silva", 10000);

        ConcessaoCredito concessaoConsignado = new ConcessaoCreditoConsignado();
        concessaoConsignado.conceder("Maria Souza", 20000);

        ConcessaoCredito concessaoImobiliario = new ConcessaoCreditoImobiliario();
        concessaoImobiliario.conceder("Pedro Santos", 300000);
    }
}
