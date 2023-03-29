package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

import java.util.List;

public class Q03_Locators extends TestBaseMethod {

    @Test
    public void test01() throws Exception {
//        Automation Exercise Category Testi
//        1- Bir test class’i olusturun ilgili ayarlari yapin
//        2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
//        3- Category bolumundeki elementleri locate edin
        WebElement categoryPart = driver.findElement(By.xpath("//a[@data-toggle='collapse']"));
//        4- Category bolumunde 3 element oldugunu test edin
        //WebElement[] categoryElements = categoryPart.findElements(By.xpath("//a[@data-toggle='collapse']")).toArray(new WebElement[0]);
        //assert categoryElements.length == 3;
        List<WebElement>categoryElements=driver.findElements(By.xpath("//a[@data-toggle='collapse']"));
        int expectedElementNumber = 3;
        int actualElementNumber = categoryElements.size();
        if (expectedElementNumber == actualElementNumber) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

//        5- Category isimlerini yazdirin
//        6- Sayfayi kapatin

    }
}
