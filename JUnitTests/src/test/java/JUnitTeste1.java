import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnitTeste1 {

    Operacao op = new Operacao();

    @Test
    public void testAdicao1() {
        assertEquals(4.0, op.adicao(2, 2));
    }

    @Test
    public void testSubtracao1() {
        assertEquals(1.0, op.subtracao(2, 2));
    }

    @Test
    public void testMultiplicacao1() {
        assertEquals(2.0, op.multiplicacao(2, 1));
    }

    @Test
    public void testDivisao1() {
        assertEquals(2.0, op.adicao(4, 2));
    }

}
