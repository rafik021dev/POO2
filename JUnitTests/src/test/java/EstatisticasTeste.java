import com.google.gson.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class EstatisticasTeste {

    private static Estatisticas estatistica;

    @BeforeAll
    static void setup() throws Exception {
        InputStream is = EstatisticasTeste.class.getClassLoader().getResourceAsStream("dados.json");

        Reader reader = new InputStreamReader(is);
        JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();
        JsonArray array = json.getAsJsonArray("dados");

        List<Double> dados = new ArrayList<>();
        for (JsonElement e : array) {
            dados.add(e.getAsDouble());
        }

        estatistica = new Estatisticas(dados);
    }

    @Test
    void testMedia() {
        assertEquals(6.5, Double.parseDouble(estatistica.getMedia()));
    }

    @Test
    void testMediana() {
        assertEquals(7.0, Double.parseDouble((estatistica.getMediana());
    }

    @Test
    void testModa() {
        assertEquals(7.0, Double.parseDouble(estatistica.getModa()));
    }

    @Test
    void testVariancia() {
        assertEquals(10.969, Double.parseDouble(estatistica.getVariancia()));
    }

    @Test
    void testDesvioPadrao() {
        assertEquals(3.312, Double.parseDouble(estatistica.getDesvioPadrao()));
    }
}

