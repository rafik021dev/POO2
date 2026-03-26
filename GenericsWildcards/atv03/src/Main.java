import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ProdutoAlimento> oAlimento = new ArrayList<>();
        oAlimento.add(new ProdutoAlimento("Arroz 2kg", 29.90, LocalDate.of(2026, 8, 10)));
        oAlimento.add(new ProdutoAlimento("Feijão 1kg", 12.50, LocalDate.of(2026, 5, 20)));

        Pedido oPedido1 = new Pedido(oAlimento);
        oPedido1.mostrarProdutos();

        System.out.println();

        List<ProdutoEletronico> oEletronicos = new ArrayList<>();
        oEletronicos.add(new ProdutoEletronico("Notebook", 3500.00, "Dell", 12));
        oEletronicos.add(new ProdutoEletronico("Mouse", 150.00, "Logitech", 6));

        Pedido oPedido2 = new Pedido(oEletronicos);
        oPedido2.mostrarProdutos();
    }
}