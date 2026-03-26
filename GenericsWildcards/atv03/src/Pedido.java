import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<? extends ProdutoX> produtos;

    public <T extends ProdutoX> Pedido(List<T> produtos) {
        this.produtos = produtos;
    }

    public void mostrarProdutos() {
        System.out.println("Produtos do Pedido");
        for (ProdutoX p : produtos) {
            System.out.println(p);
        }
        System.out.println("Total de itens: " + produtos.size());
    }
}