package ders03_LocatorsXPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocatorsQuestion {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        //2 ) Berlin’i  3 farkli relative locator ile locate edin

        /*
        <img id="pid7_thumb"
        src="bots/sl-berlin-bot.png"
        class="ui-li-thumb"

         */
        WebElement bostonElementi= driver.findElement(By.xpath("//*[@id='pid6_thumb']"));

        Thread.sleep(3000);

        // sonra locate alirken By.... yerine RelativeLocator.with() methodunu kullaniyoruz
        // with methodunun icine asil kullanmak istedigimiz elementin
        // herhangi bir ozellligini yaziyoruz

        // en son olarak yerini tarif ediyoruz

        WebElement berlinElementi = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));

        //3 ) Relative locator’larin dogru calistigini test edin
        String actualIdDegeri=berlinElementi.getAttribute("id");
        String expectedIdDegeri="pid7_thumb";
        if (actualIdDegeri.contains(expectedIdDegeri)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }
    }
}
