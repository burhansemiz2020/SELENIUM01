package ders02_driverMetotlariveWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C05_AutomationExercise {
    public static void main(String[] args) {
        //1- test classi olustur
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> linkElementleriListesi= driver.findElements(By.tagName("a"));

        int expectedLinkSayisi=147;
        int actualLinkSayisi= linkElementleriListesi.size();

        if (expectedLinkSayisi==actualLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else{
            System.out.println("Belirtilen sayida link yok, link sayisi testi FAILED");
        }
        //4- Products linkine tiklayin
        WebElement productsLinki= driver.findElement(By.partialLinkText("Products"));
        productsLinki.click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferYaziElementi= driver.findElement(By.id("sale_image"));
        //NOT reklam gelmesi halinde normalde bir kod blogu girmemiz
        // gerekiyor ancak reklami iptal ettigimizde de test passed yazisi cikiyor

        if (specialOfferYaziElementi.isDisplayed()){
            System.out.println("Special offer yazisi gorunuyor, test PASSED");
        }else{
            System.out.println("Special offer yazisi gorunmuyor, test FAILED");
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
