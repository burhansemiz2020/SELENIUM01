package ders01_SeleniumaGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03_MavenIlkClass {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(ops);

        driver.get("http://www.amazon.com");
        /*
        http yazilmazsa calismaz
        www yazilmazsa calisir
         */
        driver.manage().window().maximize();
        //burda ekrani tam ekran yapacak
        Thread.sleep(5000);
        //burda bes saniye bekleyecek bu metotla
        // istenen sure kadar kapanmasi geciktirilir.
        driver.close();
        //burda ekrani kapatacak


        //driver().get(istenenUrl)
    }
}
