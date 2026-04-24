public class Cliente {

    public static void main(String[] args) {
        ConcessionariaDirector oConcessionaria = new ConcessionariaDirector(new FiatBuilder());
        CarroProduct oCarro = oConcessionaria.getCarro();
        System.out.println(oCarro);

        oConcessionaria = new ConcessionariaDirector(new VolksBuilder());
        oCarro = oConcessionaria.getCarro();
        System.out.println(oCarro);
    }
}
