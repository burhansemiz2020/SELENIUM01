package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q18_WebElement extends TestBaseMethod {
    @Test
    public void test01() throws Exception {
//        1. “https://www.saucedemo.com” Adresine gidin
        driver.get("https://www.saucedemo.com");
//        2. Username kutusuna “standard_user” yazdirin
        WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys("standard_user" + Keys.TAB);
//        3. Password kutusuna “secret_sauce” yazdirin
        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce" + Keys.TAB);
//        4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();
//        5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement firstProductName= driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        String productName=firstProductName.getText();
        System.out.println(productName);
        String savedProductName=productName;
        firstProductName.click();
//        6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//        7. Alisveris sepetine tiklayin
        driver.findElement(By.xpath("//*[@class='shopping_cart_badge']")).click();
//        8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement cartItem= driver.findElement(By.xpath("//*[@class='cart_item_label']"));
        String cartItemName=cartItem.findElement(By.xpath("//*[@class='inventory_item_name']")).getText();
        assert(savedProductName.equals(cartItemName));
        if (savedProductName.equals(cartItemName)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        9. Sayfayi kapatin
    }
}
