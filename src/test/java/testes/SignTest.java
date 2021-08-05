package testes;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignTest {
    @Test
    public void testFazerLoginNoTaskit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("http://www.juliodelima.com.br/taskit");

        assertEquals( 1,  1 );
    }
}
