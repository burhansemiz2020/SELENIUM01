package A01SeleniumPratiques;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseMethod;

public class Q13_WebDriverMethods extends TestBaseMethod {
    //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
//(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
//yazdirin.
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com");
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();
        //Assert.assertEquals(expectedTitle, actualTitle);
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actualTitle is : " +actualTitle);
        }

//3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
//“actual” URL’i yazdirin.
        String expectedUrl="facebok";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actualTitle is : " +actualUrl);
        }
//4.https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(2500);
        driver.get("https://www.walmart.com/");
//5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitleContains="walmart.com";
        String actualTitleContains=driver.getTitle();
        //Assert.assertTrue(actualTitleContains.contains(expectedTitleContains));
        //Assert ile de bu dogrulamayi yapabiliriz ama consol da gormek istersek if yapi ile
        //test edebiliriz
        if (actualTitleContains.contains(expectedTitleContains)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actualTitle is : " + actualTitleContains);
        }
//6. Tekrar “facebook” sayfasina donun
        Thread.sleep(2000);
        driver.navigate().back();
//7. Sayfayi yenileyin
        Thread.sleep(2000);
        driver.navigate().refresh();

//8. Sayfayi tam sayfa (minimize) yapin
        driver.manage().window().minimize();
//9.Browser’i kapatin
        driver.close();
    }

}
