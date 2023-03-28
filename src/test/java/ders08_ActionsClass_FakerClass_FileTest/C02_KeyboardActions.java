package ders08_ActionsClass_FakerClass_FileTest;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMethod;

public class C02_KeyboardActions extends TestBaseMethod {
    @Test
    public void test01() throws InterruptedException {
        /*
        //        Bir tablo doldurulurken rastgele isim soyisim
        //        telefon no adres sehir password vs gibi bilgileri
        //        rastgele girmek istersek faker kutuphanesinden
        //        faydalaniriz.
        //
        //        Bunun icin oncelikle faker dependencies yi pom.xml e ekler ve
        //        kullanmak icin de faker classindan bir obje olusturururz.
        //         */

        Faker faker=new Faker();
        //facebook anasayfaya gidin
        driver.get("https://www.facebook.com");
        //cookies uyarisini kapatin
        WebElement cookiesAcceptButonu= driver.findElement(By.xpath("//button[@title='Only allow essential cookies']"));
        cookiesAcceptButonu.click();
        // yeni kayit olustur butonuna basin
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2500);



        //acilan formda  tum alanlari dodurun
        WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions=new Actions(driver);
        String mail=faker.internet().emailAddress();
        actions.click(isimKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(mail)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("12")
                .sendKeys(Keys.TAB)
                .sendKeys("fév")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        Thread.sleep(7500);





                //kaydol tusuna basin

    }
}
