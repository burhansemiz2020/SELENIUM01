package ders02_driverMetotlariveWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        Wait konusu ilerde detayli olarak anlatilacak su an icin
        bilmemeiz gereken kismi implicitlyWait sayfanin yuklenmesi ve
        kullanilacak webelementlerinin bulunmasi icin bir sure belirler.
        Bu sure icerisinde gorei yapabilirse hemen yoluna devam eder.
        Belirlenen sire bittiginde hala gorev yapilmadiysa hata verir
         */
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        System.out.println("Maximum boyutta position: " +driver.manage().window().getPosition());
        System.out.println("maximum boyutta size: " +driver.manage().window().getSize());



        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        System.out.println("Fullscreen boyutta position: " +driver.manage().window().getPosition());
        System.out.println("Fullscreen boyutta size: " +driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(200,250));
        driver.manage().window().setPosition(new Point(14,34));
        Thread.sleep(5000);
        System.out.println("istenen boyutta position : " + driver.manage().window().getPosition());
        System.out.println("Istenen boyutta size : " + driver.manage().window().getSize());
        driver.close();
    }
}
