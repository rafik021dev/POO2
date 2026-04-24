public class Cliente {
    public static void main(String[] args) {
        FabricaDeCarro oFabrica = new FabricaFiat();
        CarroSedan oSedan = oFabrica.criarCarroSedan();
        CarroPopular oPopular = oFabrica.criarCarroPopular();
        oSedan.exibirInfoSedan();
        System.out.println();
        oPopular.exibirInfoPopular();
        System.out.println();

        oFabrica = new FabricaFord();
        oSedan = oFabrica.criarCarroSedan();
        oPopular = oFabrica.criarCarroPopular();
        oSedan.exibirInfoSedan();
        System.out.println();
        oPopular.exibirInfoPopular();
    }
}
