import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegracionWebTest {

    @Test
    public void pruebaTituloPaginaIntegracion() {
        // Configurar Firefox en modo headless (sin interfaz gráfica)
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(options);

        try {
            driver.get("https://www.iplacex.cl");
            String titulo = driver.getTitle();
            assertTrue(titulo != null && !titulo.isEmpty(), "El título de la página no debe estar vacío");
        } finally {
            driver.quit();
        }
    }
}