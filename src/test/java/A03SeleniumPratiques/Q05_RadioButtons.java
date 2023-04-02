package A03SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBaseMethod;

public class Q05_RadioButtons extends TestBaseMethod {

//    Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
//    a. Verilen web sayfasına gidin.
//    https://facebook.com
//    b. Cookies’i kabul edin
//    c. Create an account buton’una basin
//    d. Radio button elementlerini locate edin ve size uygun olani secin
   @Test
   public void test01() {
       driver.get("https://facebook.com");
       driver.findElement(By.xpath("//*[@title='Allow essential and optional cookies']")).click();
       driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
       driver.findElement(By.xpath("//*[@placeholder='First name']")).sendKeys("Burhan"+Keys.TAB);
       driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Semiz"+Keys.TAB);
       driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("semizburhan2022@outlook.com"+Keys.TAB);
       driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("semizburhan2022@outlook.com"+Keys.TAB);
       driver.findElement(By.xpath("//*[@id='password_step_input']")).sendKeys("Pl.19842012*2023"+Keys.TAB+Keys.TAB);
       driver.findElement(By.id("month")).sendKeys("Mar"+Keys.TAB);
       driver.findElement(By.xpath("//*[@id='day']")).sendKeys("1"+Keys.TAB);
       driver.findElement(By.xpath("//*[@name='birthday_year']")).sendKeys("1984"+Keys.TAB+Keys.TAB+Keys.TAB);
       driver.findElement(By.xpath("//input[@value='2']")).click();
       driver.findElement(By.xpath("(//*[text()='Sign Up'])[3]")).click();
       driver.findElement(By.xpath("//*[text()='Continue']")).click();
//       driver.findElement(By.xpath("//*[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']")).click();
//       driver.findElement(By.xpath("//*[text()='Continue']")).click();
       //selenium recaptcha yapamiyor




   }
}
