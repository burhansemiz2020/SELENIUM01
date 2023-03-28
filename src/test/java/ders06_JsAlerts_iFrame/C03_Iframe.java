package ders06_JsAlerts_iFrame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_Iframe {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {
        /*
            Gittiginiz bir web sayfasinda
            aldiginiz locate dogru olmasina ragmen
            webelementi kullanamiyorsaniz
            kullanmak istediginiz web element bir iframe icerisinde olabilir
            bunu anlamak icin
            kullanmak isedigimiz webelementin
            bir iframe'in child'i veya grand child'i olup olmadigini kontrol etmeliyiz
            Eger kullanmak istedigimiz webelement
            bir iframe'in icinde ise
            once o iframe'e switchTO() ile gecmeliyiz
            Gecis yapmak icin iframe'i locate edip
            bir webelement olarak kaydetmeliyiz
            IFrame'de isimiz bittikten sonra
            ana sayfaya donmek istersek
            YINE switchTo() kullanmaliyiz
         */
        // 1 ) https://the-internet.herokuapp.com/iframe adresine gidin
        driver.get("https://the-internet.herokuapp.com/iframe");

        // 2 ) Bir metod olusturun: iframeTest
        //	- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda yazdirin.
        WebElement anIframeTextElement=driver.findElement(By.xpath("//*[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(anIframeTextElement.isEnabled());
        System.out.println(anIframeTextElement.getText());
        //	- Text Box’a “Merhaba Dunya!” yazin.

        WebElement iframeElementi = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));

        driver.switchTo().frame(iframeElementi);

        WebElement textBoxElement = driver.findElement(By.xpath("//*[@id='tinymce']"));
        textBoxElement.clear();
        textBoxElement.sendKeys("Merhaba dunya");
        // once iframe'e gecis yapalim
        Thread.sleep(2000);
        //	- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin
        //   	ve  konsolda yazdirin.
        // once anasayfaya gecmeliyiz

        // driver.switchTo().parentFrame();
        // eger ic ice iframe'ler varsa bu kod bir ust iframe'e gecis saglar
        driver.switchTo().defaultContent();

        WebElement elementalSeleniumElement=driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(elementalSeleniumElement.isDisplayed());
        System.out.println(elementalSeleniumElement.getText());
        Thread.sleep(2500);


        //   	ve  konsolda yazdirin.
        // once anasayfaya gecmeliyiz

        // driver.switchTo().parentFrame();
        // eger ic ice iframe'ler varsa bu kod bir ust iframe'e gecis saglar
    }
}
