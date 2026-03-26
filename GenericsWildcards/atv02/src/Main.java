import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Produto<Integer> oProdutoAntigo = new Produto<>(
                1001,
                25.90,
                LocalDate.of(2024, 6, 10),
                LocalDate.of(2025, 6, 10)
        );

        Produto<String> oProdutoNovo = new Produto<>(
                "111",
                99.90,
                LocalDate.of(2026, 3, 24),
                LocalDate.of(2026, 3, 25)
        );

        System.out.println("Cliente antigo (id Integer)");
        System.out.println(oProdutoAntigo);

        System.out.println("\nCliente novo (id String)");
        System.out.println(oProdutoNovo);

        Integer idAntigo = oProdutoAntigo.getId();
        String idNovo = oProdutoNovo.getId();

        System.out.println("\nId do cliente antigo: " + idAntigo);
        System.out.println("Id do cliente novo: " + idNovo);
    }
}
