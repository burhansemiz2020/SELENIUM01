package ders02_driverMetotlariveWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C01_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        Thread.sleep(5000);
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        /*
        gittigimiz web sayfasinda navigate().back() ile bir onceki sayfaya donmussek
        yeniden ilerdeki sayfaya gitmek icin navigate().forward() kullanilir.
         */
        Thread.sleep(5000);
        driver.close();
    }
}
