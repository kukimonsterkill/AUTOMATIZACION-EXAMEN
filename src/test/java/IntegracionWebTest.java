import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegracionWebTest {

    @Test
    public void pruebaTituloPaginaIntegracion() {
        // Configurar Chrome en modo headless (sin interfaz gráfica) para que funcione en el Pipeline de GitHub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);

        try {
            driver.get("https://www.iplacex.cl");
            String titulo = driver.getTitle();
            // Verifica que el título contiene algo, para simular la integración
            assertTrue(titulo != null && !titulo.isEmpty(), "El título de la página no debe estar vacío");
        } finally {
            driver.quit();
        }
    }
}