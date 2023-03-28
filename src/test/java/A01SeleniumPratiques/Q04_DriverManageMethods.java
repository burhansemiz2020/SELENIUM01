package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q04_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. Navigate Site web Facebook https://www.amazon.com/
        driver.get("http://www.facebook.com");
        Thread.sleep(1000);

        //2. Find current position and dimension of the page
        Point position=driver.manage().window().getPosition();
        Dimension size=driver.manage().window().getSize();
        System.out.println("The current point of the page is : " + position);
        System.out.println("The current dimension of the page is : " + size);

        //3. Change the position and dimensions of the page as you want
        Point newPosition=new Point(-8,-8);
        Dimension newSize=new Dimension(400,400);

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        if (position.equals(newPosition)||size.equals(newSize)){
            System.out.println("The current position and dimensions are same");
        }else {
            System.out.println("The current position and dimensions are not same");
        }
        driver.close();
    }
}
