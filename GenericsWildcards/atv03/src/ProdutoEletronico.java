public class ProdutoEletronico extends ProdutoX {
    private String marca;
    private int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, String marca, int garantiaMeses) {
        super(nome, preco);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "ProdutoEletronico" + super.toString() +
                "\nMarca = " + marca +
                "\nGarantia = " + garantiaMeses + " Meses";
    }
}