package utilities;

import org.openqa.selenium.By;

import static utilities.TestBaseClass.driver;

public class ReusableMethods extends TestBaseMethod{
    public static String getCellValues(int satir, int sutun){
        // //tbody/tr[7]/td[3]
        String dinamicXPath="//tbody/tr["+satir+"]/td["+sutun+"]";

        return driver.findElement(By.xpath(dinamicXPath)).getText();
    }
}
