package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
//        1. Yeni bir Class olusturalim.C05_NavigationMethods
public class Q10_DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//        2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        Thread.sleep(2500);
//        3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2500);
//        4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(2500);
//        5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(2500);
//        6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
//        7. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();

    }

}
