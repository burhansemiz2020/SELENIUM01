package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Q07_RelativeLocators extends TestBaseMethod {
    @Test
    public void test01() {
//        Class Work: Relative Locators
//        1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
//        2 ) Berlin’i 3 farkli relative locator ile locate edin
        WebElement Boston=driver.findElement(By.xpath("//li[@id='boston']"));
        WebElement BayArea=driver.findElement(By.xpath("//*[@id='bay-area']"));
        WebElement NYC=driver.findElement(By.xpath("//*[@id='nyc']"));

        WebElement Berlin=driver.findElement(with(By.xpath("//*[@id='berlin']")).below(NYC).toRightOf(Boston).toLeftOf(BayArea));
//        3 ) Relative locator’larin dogru calistigini test edin
        WebElement BerlinOriginal=driver.findElement(with(By.xpath("(//*[@class='ui-li-has-thumb'])[6]")));
        if (BerlinOriginal.equals(Berlin)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
    }
}
