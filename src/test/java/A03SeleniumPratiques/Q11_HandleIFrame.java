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
import java.util.List;

public class Q11_HandleIFrame {

//            1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
//            2) sayfadaki iframe sayısını bulunuz.
//            3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
//            4) ilk iframe'den çıkıp ana sayfaya dönünüz
//            5) ikinci iframe'deki (Jmeter Made Easy) linke
//            (https://www.guru99.com/live-selenium-project.html) tıklayınız

    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
    @After
    public void TearDown() {
       driver.close();
    }
    @Test
    public void test01() throws Exception {
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");
        Thread.sleep(3000);
        //*cookies kabul
        WebElement iframe0Elemential= driver.findElement(By.xpath("//iframe[@id='gdpr-consent-notice']"));
        driver.switchTo().frame(iframe0Elemential);
        driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")).click();
        driver.switchTo().defaultContent();
        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
        int iframeCount=iframes.size();
        System.out.println(iframeCount);
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
        driver.switchTo().frame(iframeElement);
        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@title='Pause (k)']")).click();
        Thread.sleep(5000);
        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();
        //5) ikinci iframe'deki (Jmeter Made Easy) linke
        //(https://www.guru99.com/live-selenium-project.html) tıklayınız
        WebElement iframeElement2=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));

        driver.switchTo().frame(iframeElement2);
        driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();

        driver.switchTo().defaultContent();
        //sayfanin ust kismindaki selenium logosuna tiklayin
        driver.findElement(By.xpath("(//*[@style='padding-bottom: 5px;'])[2]")).click();

    }
}
