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
    @org.junit.jupiter.api.Test
    void numeroClicks3() {
        int resultadoEsperado = Zapping.numeroClicks(10, 30);
        assertEquals(20, resultadoEsperado);
    }
    @org.junit.jupiter.api.Test
    void numeroClicks4() {
        int resultadoEsperado = Zapping.numeroClicks(2, 99);
        assertEquals(2, resultadoEsperado);
    }
}