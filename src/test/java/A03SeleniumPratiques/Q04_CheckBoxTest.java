package A03SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q04_CheckBoxTest extends TestBaseMethod {
    //    Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
//    a. Verilen web sayfasına gidin.
//    https://the-internet.herokuapp.com/checkboxes
//    b. Checkbox1 ve checkbox2 elementlerini locate edin.
//    c. Checkbox1 seçili değilse onay kutusunu tıklayın
//    d. Checkbox2 seçili değilse onay kutusunu tıklayın
    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox = driver.findElement(By.xpath("//*[@id='checkboxes']"));
        if (!driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).isSelected()) {
            driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
        }
        if (!driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).isSelected()) {
            driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();

        }
    }
}
