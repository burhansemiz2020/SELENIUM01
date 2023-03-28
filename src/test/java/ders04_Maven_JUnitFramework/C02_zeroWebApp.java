package ders04_Maven_JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C02_zeroWebApp {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id=\"signin_button\"]")).click();
        // 3. Login alanine “username” yazdirin
        driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");
        //4. Password alanine “password” yazdirin
        driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
        //5. Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        //burada back yapmaliyiz
        driver.navigate().back();
        //6. Online menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//li[@id='onlineBankingMenu']")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("5000");
        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");
        //9. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click();
        //10. “The payment was succcessfully submitted" mesajinin ciktigini test edin
        WebElement mesajElementi = driver.findElement(By.xpath("//div[@id='alert_content']"));
        String actualText = mesajElementi.getText();
        //The payment was succcessfully submitted.
        String expectedText ="the payment was successfully submitted.";
        if (actualText.equalsIgnoreCase(expectedText)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        // biz sadece mesajin gorundugunu test ettik
        // eger mesajin icerigini de test etmek isterseniz
        // actual ve expected yazilari kaydedip
        // bunlarin esit olup olmadigini test edebiliriz
        driver.close();

    }
}
