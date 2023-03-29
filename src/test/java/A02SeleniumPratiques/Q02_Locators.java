package A02SeleniumPratiques;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

import java.util.List;

public class Q02_Locators extends TestBaseMethod {
    String https="https://www.";
    @Test
    public void test01() throws Exception {
//        Automation Exercise Link Testi
//        1- Bir test class’i olusturun ilgili ayarlari yapin
//        2- https://www.automationexercise.com/ adresine gidin
        driver.get(https+"automationexercise.com/");
//        3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkElementsList=driver.findElements(By.tagName("a"));
        int expectedLinkNumber=147;
        int actualLinkNumber=linkElementsList.size();
        if (expectedLinkNumber==actualLinkNumber){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        4- Products linkine tiklayin
        driver.findElement(By.xpath("//a[text()=' Products']")).click();
//        5- special offer yazisinin gorundugunu test edin
        WebElement offerText=driver.findElement(By.xpath("//img[@id='sale_image']"));
        Assert.assertTrue(offerText.isDisplayed());
        if (offerText.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

//        6- Sayfayi kapatin
        driver.close();
    }
}
