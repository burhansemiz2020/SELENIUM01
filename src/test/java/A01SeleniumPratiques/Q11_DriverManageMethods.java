package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
//        1. Yeni bir Class olusturalim.C06_ManageWindow
public class Q11_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.manage().window().maximize();

//        2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
//        3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
        Thread.sleep(2000);
//        4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);
//        5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        driver.manage().window().maximize();
//        6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
//        7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
//        8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());
//        9. Sayfayi kapatin
        driver.close();
    }
}
