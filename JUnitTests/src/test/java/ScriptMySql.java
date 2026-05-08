import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScriptMySql {

    @Test
    public void testNotNullAutoIncrement() {
        Coluna coluna = new Coluna("codigo", "INT", true, true);
        assertEquals("'codigo' INT NOT NULL AUTO_INCREMENT", coluna.toString());
    }

    @Test
    public void testAutoIncrement() {
        Coluna coluna = new Coluna("codigo", "INT", false, true);
        assertEquals("'codigo' INT AUTO_INCREMENT", coluna.toString());
    }

    @Test
    public void testNotNull() {
        Coluna coluna = new Coluna("codigo", "INT", true, false);
        assertEquals("'codigo' INT NOT NULL", coluna.toString());
    }

    @Test
    public void testInt() {
        Coluna coluna = new Coluna("codigo", "INT", false, false);
        assertEquals("'codigo' INT", coluna.toString());
    }
}
