package ders08_ActionsClass_FakerClass_FileTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseMethod;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownloadsTesti extends TestBaseMethod {
    @Test
    public void test01() throws InterruptedException {
        //1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. picture.png dosyasını indirelim
        driver.findElement(By.linkText("picture.png")).click();
        Thread.sleep(5000);
        //dosya downloads a indirilir
        String dinamikDosyaYolu=System.getProperty("user.home") + "\\Downloads\\picture.png";
        //Files.exists(Paths.get(dinamikDosyaYolu)) true veya false doner
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
        System.out.println(dinamikDosyaYolu);

    }

}
