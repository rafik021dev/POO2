import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Produto<T> {
    private T id;
    private double valor;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;

    public Produto(T id, double valor, LocalDate dataFabricacao, LocalDate dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String toString() {
        DateTimeFormatter oDateFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Produto: \n" +
                "Id = " + id +
                "\nValor = R$" + valor +
                "\nFabricação = " + dataFabricacao.format(oDateFmt) +
                "\nVencimento = " + dataVencimento.format(oDateFmt);
    }

}