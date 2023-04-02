package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q16_WebElement extends TestBaseMethod {
    @Test
    public void test01() throws InterruptedException {
//        1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
//        2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
//        3. Login alanine “username” yazdirin
        WebElement login=driver.findElement(By.xpath("//*[@name='user_login']"));
        login.sendKeys("username"+ Keys.TAB);
        Thread.sleep(2000);
        //        4. Password alanine “password” yazdirin
        WebElement password=driver.findElement(By.xpath("//*[@id='user_password']"));
        password.sendKeys("password"+ Keys.TAB);
//        5. Sign in buttonuna tiklayin (site saglikli calismiyor uyelikte sorun var
        WebElement button=driver.findElement(By.xpath("//*[@id='user_remember_me']"));
        button.sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//*[@value='Sign in']")).click();


        driver.findElement(By.xpath("//*[text()='Zero Bank']")).click();


//        6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[text()='More Services']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();
        Thread.sleep(6000);
// LE SIte internet ne marche pas>>>>>>>>>>>>>>>+++++++===========
//        7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
//        8. tarih kismina “2020-09-10” yazdirin
//        9. Pay buttonuna tiklayin
//        10. “The payment was successfully submitted.” mesajinin
//        ciktigini test edin
    }
}
