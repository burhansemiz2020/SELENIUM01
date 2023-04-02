package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q15_WebElement extends TestBaseMethod {
    @Test
    public void test01() {
//        Class Work Amazon Search Test
//        1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com");
//        2- arama kutusunu locate edelim
        WebElement searchElement =driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
//        3- “Samsung headphones” ile arama yapalim
        searchElement.sendKeys("Samsung");
        driver.findElement(By.id("nav-search-submit-button")).click();
//        4- Bulunan sonuc sayisini yazdiralim
        WebElement resultNum = driver.findElement(By.xpath("//*[text()='1-16 of over 5,000 results for']"));
        System.out.println(resultNum);
//        5- Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
//        6- Sayfadaki tum basliklari yazdiralim
        WebElement allTitles=driver.findElement(By.xpath("(//*[@class='a-normal a-spacing-micro'])[1]"));
        System.out.println(allTitles);

    }
}
