import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void pruebaSumaUnitaria() {
        // Prueba unitaria muy simple
        int resultado = 2 + 3;
        assertEquals(5, resultado, "La suma debe ser 5");
    }
}