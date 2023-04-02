package A03SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02_Assertions {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
//1) Bir class oluşturun: YoutubeAssertions
//2) https://www.youtube.com adresine gidin
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
    }
    @AfterClass
    public static void TearDown(){
        driver.close();
    }
    @Test
    public void test01(){
//3) Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
//○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        String actualTitle =driver.getTitle();
        String beklenenTitle = "YouTube";
        Assert.assertEquals(beklenenTitle,actualTitle);
    }
    @Test
    public void test02() {
//○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@id=\"logo\"])[2]")).isDisplayed());
    }
    @Test
    public void test03() {
//○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
            Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='search'])[2]")).isEnabled());
    }
    @Test
    public void test04() {
//○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        String actualTitle = driver.getTitle();
        String beklenenTitle = "youtube";
        Assert.assertNotEquals(beklenenTitle, actualTitle);
    }



}
