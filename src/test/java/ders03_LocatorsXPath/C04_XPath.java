package ders03_LocatorsXPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04_XPath {
    public static void main(String[] args) {
        //        1- bir class olusturun
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //        3- Browseri tam sayfa yapin;
        driver.manage().window().maximize();
        //        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String expectedTitle="Spend less";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        //        6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
        //        7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();
        //        8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img")).click();
        //        9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//*[@id=\"gc-mini-picker-amount-1\"]")).click();
        //        10-Urun ucretinin 25$ oldugunu test edin
        WebElement urunUcreti = driver.findElement(By.xpath("//*[@id=\"gc-live-preview-amount\"]"));
        String expectedUcret="25$";
        String actualUcret=urunUcreti.getText();
        if (actualUcret.contains(actualUcret)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println("Actual Ucret : " +actualUcret);
        }
        driver.close();
                //        11-Sayfayi kapatin
    }
}
