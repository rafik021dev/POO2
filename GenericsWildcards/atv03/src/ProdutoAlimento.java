import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoAlimento extends ProdutoX {
    private final LocalDate dataVencimento;

    public ProdutoAlimento(String nome, double preco, LocalDate dataVencimento) {
        super(nome, preco);
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        DateTimeFormatter oDateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "ProdutoAlimento" + super.toString() +
                "\nVencimento = " + dataVencimento.format(oDateFmt);
    }
}