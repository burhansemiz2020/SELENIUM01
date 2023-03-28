package ders08_ActionsClass_FakerClass_FileTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseMethod;

public class C01_KeyboardActions extends TestBaseMethod {
    @Test
            public void test01() throws InterruptedException {
        //wisequarter ana sayfaya gidin
        driver.get("https://www.wisequarter.com");
        //Free Java menusune kadar gidi

        //menusune kadar asagi inin


        Actions actions=new Actions(driver);
        /*
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

         */
        Thread.sleep(3000);

        //menuye click yapildigini test edin
        driver.findElement(By.xpath("(//img[@alt='software-development'])[1]")).click();
        //url de  software-development gectigini test edelim
        String expectedUrl="software-development";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));


        Thread.sleep(13000);



    }

    /*
              Driver bir web sayfasina gittiginde
              asagi bolumlerde oldugu icin gorunmeyen bir element'e islem yapmasini istersek
              islem yapilacagini veya yapilamayacigi ONGOREMEYIZ
              front-end developer'in yazdigi kodlara gore
              islem yapabildigimiz sayfalar olabilecegi gibi
              islem yapamayacagimiz sayfalar da olabilir
              isinizi garantiye almak isterseniz
              islem yapacaginiz webelemente kadar asagi inmelisiniz.
         */

    // wisequarter ana sayfaya gidin
    // Java Test Automation Engineer
    // menusune kadar asagi inin
    // menuye click yapin
    // menuye click yapildigini test edin
    // url'de automation-engineer gectigini test edelim



}
