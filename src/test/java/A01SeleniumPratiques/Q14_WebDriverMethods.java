package A01SeleniumPratiques;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBaseMethod;

import java.time.Duration;

public class Q14_WebDriverMethods extends TestBaseMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();

        //3. Login alanina  “username” yazdirin
        WebElement loginKutusu=driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");

        //4. Password alanine “password” yazdirin
        WebElement passKutusu= driver.findElement(By.id("user_password"));
        passKutusu.sendKeys("password");

        //5. Sign in buttonuna tiklayin
        driver.findElement(By.name("submit")).click();

        //6. navigate back yapip,online banking menusunden Pay Bills sayfasina gidin
        driver.navigate().back();
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.id("pay_bills_link")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement paraButtonu=driver.findElement(By.id("sp_amount"));
        paraButtonu.sendKeys("500");

        //8. tarih kismina “2020-09-10” yazdirin
        WebElement dataElementi=driver.findElement(By.id("sp_date"));
        dataElementi.sendKeys("2020-09-10");

        //9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin
        WebElement sonucYazisi=driver.findElement(By.xpath("//span[@title='$ 500 payed to payee sprint']"));

        String expectedYazi="The payment was successfully submitted.";

        if (sonucYazisi.getText().equals(expectedYazi)){
            System.out.println("Zero Test PASSED");
        }else {
            System.out.println("Zero Test FAILED");
        }


        Thread.sleep(2000);
        driver.close();

    }
}
