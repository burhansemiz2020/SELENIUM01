package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Q00_SeleniumStart {
    WebDriver driver;
    String https="https://www.";

    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void TearDown() {
        driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://www.google.com");

        driver.navigate().to(https+"amazon.com");
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        System.out.println("abcd");
    }
}
