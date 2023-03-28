package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
//        1. Yeni bir Class olusturalim.C07_ManageWindowSet
public class Q12_DriverManageMethods {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        3. Sayfanin konumunu ve boyutlarini yazdirin
        Point position=driver.manage().window().getPosition();
        Dimension size=driver.manage().window().getSize();
        System.out.println("Sayfanin boyutu : " + (driver.manage().window().getSize()) + "\nSayfanin konumu : "
        + (driver.manage().window().getPosition()));
//        4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Point newPosition = new Point(-8, -8);
        Dimension newSize = new Dimension(1936, 1056);
//        5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        if (size.equals(newSize)||position.equals(newPosition)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        8. Sayfayi kapatin
        driver.close();

    }
}
