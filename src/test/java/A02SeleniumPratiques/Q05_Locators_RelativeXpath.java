package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q05_Locators_RelativeXpath extends TestBaseMethod {
    @Test
    public void test01() throws Exception {
//        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//        2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
//        3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        4- Delete tusuna basin
        deleteButton.click();
//        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

    }
}
