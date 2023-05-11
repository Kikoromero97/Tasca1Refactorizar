import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @org.junit.jupiter.api.Test
    void numeroClicks1() {
        int resultadoEsperado = Zapping.numeroClicks(0, 0);
        assertEquals(0, resultadoEsperado);
    }
}