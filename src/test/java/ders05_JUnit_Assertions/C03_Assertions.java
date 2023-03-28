package ders05_JUnit_Assertions;

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

public class C03_Assertions {
    /*
    //1) Bir class oluşturun: BestBuyAssertions
    //2) https://www.bestbuy.com/ Adresine gidin
    // farkli test method’lari olusturarak asagidaki testleri yapin
    //		○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //		○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //		○ logoTest => BestBuy logosunun görüntülendigini test edin
    //		○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");


    }
    @AfterClass
    public static void teardown() {
        driver.close();
    }
    @Test
    public void test01() {
        //Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        String expectedUrl="https://www.bestbuy.com/";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Test
    public void test02() {
        //titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        String expectedContents="Rest";
        String actualTitle = driver.getTitle();
        Assert.assertFalse(actualTitle.contains("expectedContents"));

    }
    @Test
    public void test03() {
        //logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logoElementi= driver.findElement(By.xpath("(//img[@alt='Best Buy Logo'])[1]"));
        Assert.assertTrue(logoElementi.isDisplayed());

    }
    @Test
    //FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
    public void test04(){
        WebElement linkFrancais=driver.findElement(By.xpath("//*[text()='Français']"));
        Assert.assertTrue(linkFrancais.isDisplayed());



    }


}
