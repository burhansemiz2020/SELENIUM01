package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q03_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(3000);
        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();
        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        driver.manage().window().maximize();

        Thread.sleep(3000);
        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        driver.manage().window().setSize(new Dimension(200, 500));
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(10, 20));
        //9. Sayfayi kapatin
        driver.close();



    }

}
