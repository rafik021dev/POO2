//import org.junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTeste {

    Operacao op = new Operacao();

    @Test
    public void testAdicao() {
        assertEquals(4.0, op.adicao(2, 2));
        assertEquals(3.0, op.adicao(1, 1));
        assertEquals(6.0, op.adicao(2, 4));
    }

    @Test
    public void testSubtracao() {
        assertEquals(1.0, op.subtracao(2, 2));
        assertEquals(1.0, op.subtracao(3, 2));
        assertEquals(-2.0, op.subtracao(2, 4));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(2.0, op.multiplicacao(2, 1));
        assertEquals(6.0, op.multiplicacao(3, 2));
        assertEquals(8.0, op.multiplicacao(2, 4));
    }

    @Test
    public void testDivisao() {
        assertEquals(2.0, op.adicao(4, 2));
        assertEquals(3.0, op.adicao(6, 2));
        assertEquals(5.0, op.adicao(12, 6));
    }
}
