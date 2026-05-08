public class Coluna {

    private String nome;
    private String tipo;
    private boolean notNull;
    private boolean autoIncrement;

    public Coluna(String nome, String tipo, boolean notNull, boolean autoIncrement) {
        this.nome = nome;
        this.tipo = tipo;
        this.notNull = notNull;
        this.autoIncrement = autoIncrement;
    }

    public String gerarScript() {
        StringBuilder sb = new StringBuilder();
        sb.append("'").append(nome).append("'").append(tipo);
        if (notNull) {
            sb.append(" NOT NULL");
        }
        if (autoIncrement) {
            sb.append(" AUTO_INCREMENT");
        }
        sb.append(",");
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isNotNull() {
        return notNull;
    }

    public void setNotNull(boolean notNull) {
        this.notNull = notNull;
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }
}
