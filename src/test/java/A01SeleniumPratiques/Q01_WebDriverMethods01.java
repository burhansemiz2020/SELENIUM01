package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q01_WebDriverMethods01 {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }
        else {
            System.out.println("Test FAILED");
        }
        //6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        if (driver.getCurrentUrl().contains("amazon")) {
            System.out.println("Test PASSED");
        }
        else {
            System.out.println("Test FAILED");
        }
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        System.out.println(driver.getPageSource().contains("shop"));
        //veya if else ile de gosterebiliriz
        String expetedContext="alisveris";
        String actualContext= driver.getPageSource();
        if (actualContext.contains(expetedContext)){
            System.out.println("Test PASSED");
        }
        else {
            System.out.println("Test FAILED");
        }
        driver.close();
    }
}
