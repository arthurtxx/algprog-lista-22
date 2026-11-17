public class SistemaVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Volkswagen", "Passat Stage 3", 2018);
        Veiculo moto = new Moto("Honda", "CB1000", 2015);
        Veiculo caminhao = new Caminhao("Scania", "Scania 770SV8", 2026);

        System.out.println("Detalhes do Carro:");
        carro.exibirDetalhes();
        carro.acelerar();

        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
        moto.acelerar();

        System.out.println("\nDetalhes do Caminhão:");
        caminhao.exibirDetalhes();
        caminhao.acelerar();
    }
}