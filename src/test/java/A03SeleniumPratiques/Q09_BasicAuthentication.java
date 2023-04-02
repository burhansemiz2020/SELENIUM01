package A03SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import utilities.TestBaseMethod;

import static org.apache.commons.io.FileUtils.waitFor;

public class Q09_BasicAuthentication extends TestBaseMethod {
    @Test
    public void test01() {
//        2- https://the-internet.herokuapp.com/basic_auth
//        sayfasina gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //4- Basarili sekilde sayfaya girildigini dogrulayin
//        String actualGirisYazisi= driver.findElement(By.tagName("p")).getText();
//        String expectedIcerik = "Congratulations";
//        Assert.assertTrue(actualGirisYazisi.contains(expectedIcerik));
//        3- asagidaki yontem ve test datalarini kullanarak
//        authentication’i yapin
//        Html komutu : https://username:password@URL
//        Username : admin
//        password : admin
//        4- Basarili sekilde sayfaya girildigini dogrulayin

    }

}
