public class Main {
    public static void main(String[] args) {
        ConfirmacaoReserva reservaBrasil = new ConfirmacaoReserva(new FabricaBrasil());
        reservaBrasil.confirmar("Ana Lima", "123.456.789-00", 800);

        ConfirmacaoReserva reservaPortugal = new ConfirmacaoReserva(new FabricaPortugal());
        reservaPortugal.confirmar("Joao Pereira", "123456789", 450);
    }
}
