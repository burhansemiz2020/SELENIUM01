package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q07_CreateWebElementObject {
    public static void main(String[] args) throws InterruptedException {
//        1- Create a test class and configure the relevant settings.
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//        2- Go to https://www.amazon.com.
        driver.get("https://www.amazon.com");
//        3- Locate the Amazon search box.
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
//        4- Type "Nutella" in the search box.
        searchBox.sendKeys("Nutella");
        Thread.sleep(2500);
//        5- Press the ENTER key to perform the search.
        searchBox.sendKeys(Keys.ENTER);


    }
}
