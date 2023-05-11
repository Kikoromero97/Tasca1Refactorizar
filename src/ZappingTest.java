import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @org.junit.jupiter.api.Test
    void numeroClicks1() {
        int resultadoEsperado = Zapping.numeroClicks(0, 0);
        assertEquals(0, resultadoEsperado);
    }

    @org.junit.jupiter.api.Test
    void numeroClicks2() {
        int resultadoEsperado = Zapping.numeroClicks(1, 2);
        assertEquals(1, resultadoEsperado);
    }
}