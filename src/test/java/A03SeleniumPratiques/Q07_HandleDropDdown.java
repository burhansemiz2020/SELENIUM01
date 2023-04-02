package A03SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilities.TestBaseMethod;

public class Q07_HandleDropDdown extends TestBaseMethod {
    @Test
    public void test01() throws Exception {
//        Bir class oluşturun: C3_DropDownAmazon
//        https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");
//        - Test 1
//        Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
//        oldugunu test edin
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select = new Select(ddm);
        int actualNumberCategory = select.getOptions().size();
        System.out.println("Actual Number of the category : " +actualNumberCategory);
        int expectedNumberCategory = 28;
        Assert.assertEquals(actualNumberCategory, expectedNumberCategory);

//         -Test 2
//        1. Kategori menusunden Books secenegini secin
        select.selectByVisibleText("Books");
//        2. Arama kutusuna Java yazin ve aratin
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java" + Keys.ENTER);
//        3. Bulunan sonuc sayisini yazdirin
        WebElement resultNumber=driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(resultNumber.getText());
//        4. Sonucun Java kelimesini icerdigini test edin
        String expectedContext="Java";
        String actualContext=resultNumber.getText();
        Assert.assertTrue(actualContext.contains(expectedContext));
    }
}
