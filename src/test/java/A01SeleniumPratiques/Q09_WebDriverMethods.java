package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

//        1. Yeni bir package olusturalim : day01
//        2. Yeni bir class olusturalim : C03_GetMethods
public class Q09_WebDriverMethods {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
//        3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
//        4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
        System.out.println("===");
//        5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        System.out.println("===");
//        6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
        System.out.println("===");
//        7. Sayfa url’inin “amazon” icerdigini test edin.
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        System.out.println("===");
//        8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        System.out.println("===");
//        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedSourceCode = "shop";
        String actualSourceCode = driver.getPageSource();
        if (actualSourceCode.contains(expectedSourceCode)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        10. Sayfayi kapatin.
        driver.close();


    }
}
