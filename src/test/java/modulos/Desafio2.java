package modulos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@DisplayName("Testes Web")
public class Desafio2 {
    @Test
    @DisplayName("Mudar o valor da combo Select version para “Bootstrap V4 Theme")
    public void testMudarValorDaComboSelectParaBooststrapV4Theme() {

        // Abrir Navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        // Vou maximizar a tela
        navegador.manage().window().maximize();

        // Vou definir um tempo de espera padrao de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        // Navegar para a pagina da Lojinha Web
        navegador.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");

        // Mudar theme de Bootstrap V4 Theme para Bootstrap V4 Theme
        navegador.findElement(By.id("switch-version-select")).click();
        navegador.findElement(By.xpath("//*[@id=\"switch-version-select\"]/option[4]")).click();

        // Adicionar customer
        navegador.findElement(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a")).click();

        // Inserir dados gerais do cliente
        navegador.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
        navegador.findElement(By.id("field-contactLastName")).sendKeys("Teste");
        navegador.findElement(By.id("field-contactFirstName")).sendKeys("Luiz Roberto");
        navegador.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
        navegador.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
        navegador.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
        navegador.findElement(By.id("field-city")).sendKeys("Porto Alegre");
        navegador.findElement(By.id("field-state")).sendKeys("RS");
        navegador.findElement(By.id("field-postalCode")).sendKeys("91000-000");
        navegador.findElement(By.id("field-country")).sendKeys("Brasil");
        navegador.findElement(By.id("field-creditLimit")).sendKeys("200");
        navegador.findElement(By.id("form-button-save")).click();


        // Validar mensagem apresentada
        String mensagem = navegador.findElement(By.id("report-success")).getText();
        Assertions.assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", "Your data has been successfully stored into the database. Edit Record or Go back to list", mensagem);

        // Clicar no Go back list
        navegador.findElement(By.xpath("//*[@id=\"report-success\"]/p/a[2]")).click();

        // Preencher CustomerName
        navegador.findElement(By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td:nth-child(3) > input")).click();
        navegador.findElement(By.name("customerName")).sendKeys("Teste Sicredi");

        // Vou definir um tempo de espera padrao de 5 segundos
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(999999));


        // Clicar no checkbox
        navegador.findElement(By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td.no-border-right > div")).click();




    }

}