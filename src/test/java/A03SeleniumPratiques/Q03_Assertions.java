package A03SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03_Assertions {
    //1. Bir Class olusturalim YanlisEmailTesti
//2. https://automationexercise.com/ sayfasina gidelim
//3. Sign in butonuna basalim
//4. Email kutusuna @isareti olmayan bir mail yazip enter’a bastigimizda “Invalid
//   email address” uyarisi ciktigini test edelim
    static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://automationexercise.com/");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        WebElement logInTest = driver.findElement(By.xpath("//*[text()=\" Signup / Login\"]"));
        logInTest.click();

    }
    @Test
    public void test02() {
        driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys("burhan.com");
    }
}
