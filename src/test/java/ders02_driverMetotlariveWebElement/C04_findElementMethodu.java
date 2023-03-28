package ders02_driverMetotlariveWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C04_findElementMethodu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        adrese git locator i bul ve unique olsun
         */
        driver.get("https://www.amazon.com");
        //nutella aratalim
        WebElement aramaKutusum = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusum.sendKeys("Nutella"+ Keys.ENTER);
        //Bir de Java aratalim
        Thread.sleep(2000);
        aramaKutusum = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusum.clear();
        aramaKutusum.sendKeys("Java"+ Keys.ENTER);

        Thread.sleep(10000);
        driver.close();



    }
}
