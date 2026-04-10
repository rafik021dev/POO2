import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Conexao instance;

    private Conexao(){
    }

    private static final String URL = "jdbc:mysql://localhost:"+ getPorta() + "/atividade";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static int getPorta() {
        return 3306;
    }

    public static Conexao getInstance(){
        if(instance == null){
            instance = new Conexao();
        }
        return instance;
    }

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
