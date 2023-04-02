package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q04_Locators extends TestBaseMethod {
    @Test
    public void test01() throws InterruptedException {
//        1- https://www.amazon.com/ sayfasına gidin.
        driver.get("https://www.amazon.com/");
//        2- Arama kutusuna “city bike” yazip aratin
        WebElement search01=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search01.sendKeys("city bike" + Keys.ENTER);
        Thread.sleep(3000);

//        3- Görüntülenen sonuçların sayısını yazdırın
        WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println(result.getSize());
//        4- Listeden ilk urunun resmine tıklayın.
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='IDS Home unYOUsual U Transformer 20\" Folding City Bike Bicycle 6 Speed Shimano Gear Steel Frame Mudguard Rear Carrier Front Rear Wheel Reflectors']")).click();
        Thread.sleep(2000);
    }
}
