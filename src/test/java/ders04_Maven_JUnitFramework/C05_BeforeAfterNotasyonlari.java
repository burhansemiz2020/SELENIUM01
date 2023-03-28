package ders04_Maven_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C05_BeforeAfterNotasyonlari {
    // 3 farkli test methodu olusturun, bu method'larda
    // amazon, wisequarter ve youtube anasayfalarina gidip
    // o sayfalara gittigimizi test edin ve sayfayi kapatin

    /*
        JUnit notasyonlar sayesinde
        her test method'undan veya her test class'indan once veya sonra
        calistirilmasi gereken kodlar varsa
        bunlari ayri bir method olarak hazirlayabiliriz
        boylece ayni kodlari tekrar tekrar yazmak zorunda kalmayiz
     */
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("setup");

    }
    @After

    public void teardown() {
        System.out.println("teardown");
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {


        driver.get("https://www.amazon.com");

        String expectedUrl = "amazon111";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Amazon Test PASSED");
        } else {
            System.out.println("Amazon Test FAILED");
        }
        Thread.sleep(500);

    }

    @Test
    public void test02() throws InterruptedException {


        driver.get("https://www.wisequarter.com");

        String expectedUrl = "wisequarter111";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Wisequarter Test PASSED");
        } else {
            System.out.println("Wisequarter Test FAILED");
        }
        Thread.sleep(500);

    }

    @Test
    public void test03() throws InterruptedException {


        driver.get("https://www.youtube.com");

        String expectedUrl = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Youtube Test PASSED");
        } else {
            System.out.println("Youtube Test FAILED");
        }
        Thread.sleep(500);
    }
}