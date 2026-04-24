public class Conexao {

    private String host;
    private String porta;
    private String user;
    private String pass;

    public Conexao(){
    }

    public String getHost() {
        return host;
    }

    public Conexao setHost(String host) {
        this.host = host;
        return this;
    }

    public String getPorta() {
        return porta;
    }

    public Conexao setPorta(String porta) {
        this.porta = porta;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Conexao setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public Conexao setPass(String pass) {
        this.pass = pass;
        return this;
    }



}
