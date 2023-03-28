package ders06_JsAlerts_iFrame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_JsAlerts {
    // https://the-internet.herokuapp.com/javascript_alerts
    // 3 method olusturun ve 3 butonu test edin
    static WebDriver driver;

    @BeforeClass
    public static void setup() {
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
        // ilk butona click yapin
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        // OK diyerek alert'i kapatin

        driver.switchTo().alert().accept();
        // OK butonuna basildigini test edin
        WebElement resultElementi= driver.findElement(By.xpath("//p[@id='result']"));
        Thread.sleep(2000);
        String expectedYazi= "You successfully clicked an alert";
        String actualResultYazisi= resultElementi.getText();

        Assert.assertEquals(expectedYazi,actualResultYazisi);
        Thread.sleep(2500);
    }

    @Test
    public void test02() throws InterruptedException {
        // ikinci butona basin
        
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        // alert uzerindeki yazinin "I am a JS Confirm" oldugunu test edin
        String expectedAlert="I am a JS Confirm";
        String actualAlert=driver.switchTo().alert().getText();
        Assert.assertEquals(expectedAlert,actualAlert);
        
        // cancel diyerek alert'i kapatin
        driver.switchTo().alert().dismiss();
        // cancel'a basildigini test edin
        WebElement resultElementi = driver.findElement(By.xpath("//p[@id='result']"));
        Thread.sleep(2500);
        String expectedResult="You clicked: Cancel";
        String actualResult=resultElementi.getText();
        Assert.assertEquals(expectedResult, actualResult);
        Thread.sleep(2500);
    }
    @Test
    public void test03() throws InterruptedException {
        // ucuncu alert butonuna click yapin
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        // cikan alert'e "Selenium heyecandir" yazdirin
        driver.switchTo().alert().sendKeys("Selenium heyecandir");
        // OK butonuna basarak alert'i kapatin
        driver.switchTo().alert().accept();

        // cikan sonuc yazisinin "Selenium heyecandir" icerdigini test edin
        WebElement resultElementi = driver.findElement(By.xpath("//p[@id='result']"));
        Thread.sleep(2500);
        String expectedResult = "Selenium heyecandir";
        String actualResult = resultElementi.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));


        Thread.sleep(2500);

    }


}
