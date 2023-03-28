package ders05_JUnit_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04Assertions {

    /*
    //1) Bir class oluşturun: YoutubeAssertions
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
    //	○ titleTest 	=> Sayfa başlığının “YouTube” oldugunu test edin
    //	○ imageTest 	=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //	○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //	○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
     */
    static WebDriver driver;
    @BeforeClass
    public void setup() {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        WebElement cookiesElementi=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[12]"));
        cookiesElementi.click();

    }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
    @Test
    //titleTest 	=> Sayfa başlığının “YouTube” oldugunu test edin
    public void test01() {
        String expectedTitle="YouTube";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);



    }
    @Test
    //imageTest 	=> YouTube resminin görüntülendiğini (isDisplayed()) test edin
    public void test02() {
        WebElement logoElementi=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());


    }
    @Test
    //Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    public void test03() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        Assert.assertTrue(searchBox.isEnabled());


    }
    @Test
    //wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    public void test04() {
        String expectedTitle="youtube";
        String actualTitle=driver.getTitle();
        Assert.assertNotEquals(expectedTitle, actualTitle);

    }

}
