package ders01_SeleniumaGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C04_DriverGetMetotlari {
    public static void main(String[] args) throws InterruptedException {
        //Otomasyonun ilk donemi
        //Driveri olusturmak ve bunun icin gerekli ayarlari yapamaktir.
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());
        /*
        driver her olusturuldugunda acilan her sayfa icin bir
        handle degeri alir.

         */

        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
