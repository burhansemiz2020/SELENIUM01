package ders10_ExcelAutomation_GetScreenshot;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBaseMethod;

import java.io.File;
import java.io.IOException;

public class C04_TumSAyfaGetScreenShot extends TestBaseMethod {
    @Test
            public void test01() throws IOException {
    // Amazon anasayfaya gidin
    driver.get("https://www.amazon.com");
    // Arama kutusuna Nutella yazdirip aratin
    WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
    aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    // Arama sonuclarinin Nutella icerdigini test edin
        WebElement aramaSonucu = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
    String expectedResult="Nutella";
    String actualResult=aramaSonucu.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        // rapora eklenmek uzere tum sayfa fotografini cekin
        // 1- obje olusturalim, driver'i cast ederek atayalim
        TakesScreenshot tss= (TakesScreenshot) driver;
        // 2- dosyayi nerede ve hangi uzanti ile olusturacksak
        //    File class'indan bir obje olusturup, parametre olarak yazalim
        File tumsayfaScreenShot = new File("target/ekranResimleri/tumSayfa.png");
        // 3- tss objesini kullanarak fotografi cekip, gecici bir dosyaya atayalim
        File geciciDosya=tss.getScreenshotAs(OutputType.FILE);
        // 4- gecici dosyayi, olusturdugumuz tumSayfaScreenShot'a kopyalayalim
        FileUtils.copyFile(geciciDosya, tumsayfaScreenShot);




    }

}
