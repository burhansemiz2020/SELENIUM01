package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q06_RepeatQuestions extends TestBaseMethod {
    @Test
    public void test01() throws Exception {
//        1- bir class olusturun
//        2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
//        3- Browseri minimize edin
        driver.manage().window().minimize();
//          Browseri maksimize edin
        driver.manage().window().maximize();
//        4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
//        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle = "Spend less";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
//        6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();
//        7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();
//        8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
//        9- Gift card details’den 25 $’i secin
        driver.findElement(By.id("a-autoid-28")).click();

//        10-Urun ucretinin 25$ oldugunu test edin
        WebElement price=driver.findElement(By.xpath("(//span[text()='$25.00'])[2]"));

        String expectedPrice = "$25.00";
        String actualPrice = price.getText();
        if (actualPrice.equals(expectedPrice)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

//        11-Sayfayi kapatin
    }
}
