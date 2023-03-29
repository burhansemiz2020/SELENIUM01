package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q01_WebElementCreate extends TestBaseMethod {
    String https="https://www.";
    @Test
    public void test01() throws InterruptedException {
//        Amazon Arama Testi
//        1- Bir test class’i olusturun ilgili ayarlari yapin
//        2- https://www.amazon.com adresine gidin
        driver.get(https+"amazon.com");
//        3- amazon arama kutusunu locate edin
        WebElement amazonSearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//        4- arama kutusuna “Nutella” yazdirin
//        5- arama islemini yapabilmek icin ENTER tusuna basin
        amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        Thread.sleep(2500);

    }
}
