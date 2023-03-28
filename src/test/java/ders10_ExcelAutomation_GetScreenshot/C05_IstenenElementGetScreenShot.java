package ders10_ExcelAutomation_GetScreenshot;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

import java.io.File;
import java.io.IOException;

public class C05_IstenenElementGetScreenShot extends TestBaseMethod {
    @Test
    public void test01() throws IOException {
        // Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // Arama kutusuna Nutella yazdirip aratin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // Arama sonuclarinin Nutella icerdigini test edin
        WebElement aramaSonucu = driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedResult = "Nutella";
        String actualResult = aramaSonucu.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));

        // rapora eklenmek uzere arama sonuc yazisi fotografini cekin
        //1. Fotograf cekmek istedigimiz elementi locate edin
        //2. dosyayo nerede ve hangi uzanti ile olusturacaksak
        // file classinda bir obje olusturup parametre olarak yazalim
        File istenenElement = new File("target/ekranResimleri/istenenElement.png");
        // 3- tss objesini kullanarak fotografi cekip, gecici bir dosyaya atayalim
        File geciciDosya=aramaSonucu.getScreenshotAs(OutputType.FILE);
        // 4- gecici dosyayi, olusturdugumuz tumSayfaScreenShot'a kopyalayalim
        FileUtils.copyFile(geciciDosya, istenenElement);



    }
}
