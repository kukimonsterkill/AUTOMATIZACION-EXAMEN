import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegracionWebTest {

    @Test
    public void pruebaTituloPaginaIntegracion() {
        options.addArguments("--headless");


        try {
            driver.get("https://www.iplacex.cl");
            String titulo = driver.getTitle();
            assertTrue(titulo != null && !titulo.isEmpty(), "El título de la página no debe estar vacío");
        } finally {
            driver.quit();
        }
    }
}