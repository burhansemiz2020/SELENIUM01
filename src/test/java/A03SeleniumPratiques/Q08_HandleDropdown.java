package A03SeleniumPratiques;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseMethod;

public class Q08_HandleDropdown extends TestBaseMethod {
    @Test
    public void test01() throws Exception {
//        1. http://zero.webappsecurity.com/ Adresine gidin
        driver.get("http://zero.webappsecurity.com");
//        2. Sign in butonuna basin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
//        3. Login kutusuna “username” yazin
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
//        4. Password kutusuna “password.” yazin
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
//        5. Sign in tusuna basin
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.navigate().back();//burda sayfa hata veriyor navigate back ile geri donuyoruz
//        6. Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id='online-banking']")).click();
        driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
//        7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
//        8. “Currency” drop down menusunden Eurozone’u secin
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='pc_currency']"));
        Select allDropdown = new Select(dropdown);
        allDropdown.selectByValue("EUR");
//        9. “amount” kutusuna bir sayi girin
        driver.findElement(By.xpath("//*[@id='pc_amount']")).sendKeys("5000");
//        10. “US Dollars” in secilmedigini test edin
        WebElement usaRadioButton=driver.findElement(By.xpath("//*[@id='pc_inDollars_true']"));
        Assert.assertFalse(usaRadioButton.isSelected());
//        11. “Selected currency” butonunu secin
        driver.findElement(By.xpath("//input[@id='pc_inDollars_false']")).click();
//        12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        driver.findElement(By.id("pc_calculate_costs")).click();
        driver.findElement(By.id("purchase_cash")).click();
//        13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
//        kontrol edin.
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='alert_content']")).isDisplayed());
    }
}
