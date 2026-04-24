public class Cliente {

    public static void main(String[] args) {
        PalioPrototype oPrototipoPalio = new PalioPrototype();
        CarroPrototype oPalioNovo = oPrototipoPalio.clonar();
        oPalioNovo.setValorCompra(27900.0);
        CarroPrototype oPalioUsado = oPrototipoPalio.clonar();
        oPalioUsado.setValorCompra(21000.0);
        System.out.println(oPalioNovo.exibirInfo());
        System.out.println(oPalioUsado.exibirInfo());
    }
}
