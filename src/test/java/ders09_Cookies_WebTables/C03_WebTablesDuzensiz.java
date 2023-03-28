package ders09_Cookies_WebTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

import java.util.List;

public class C03_WebTablesDuzensiz extends TestBaseMethod {
    @Test
    public void test01() {
//        Bir Class olusturun D19_WebtablesHomework
//        1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");
//        2. Headers da bulunan basliklari yazdirin
        List<WebElement> headerElementsList = driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
        for (WebElement eachElement : headerElementsList
        ) {
            System.out.println(eachElement.getText());

        }
//        3. 3.sutunun basligini yazdirin
        System.out.println("Title of the thirth colon: " + headerElementsList.get(2).getText());
//        4. Tablodaki tum datalari yazdirin
        List<WebElement> dataElementsList = driver.findElements(By.xpath("//div[@class='rt-td']"));
        for (WebElement eachElement : dataElementsList) {
            if (!eachElement.getText().isBlank()) {
                System.out.println(eachElement.getText());
            }

        }

//        5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        int cellsNotNull = 0;
        for (WebElement eachElement : dataElementsList) {
            if (!eachElement.getText().isBlank()) {
                cellsNotNull++;
            }

        }
        System.out.println("cellsNotNull : " + cellsNotNull);
//        6. Tablodaki satir sayisini yazdirin
        List<WebElement> dataElementsLineList = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println("line numbers " + dataElementsLineList.size());

//        7. Tablodaki sutun sayisini yazdirin
        System.out.println("The number of the colon in yhe table: " + headerElementsList.size());
//        8. Tablodaki 3.kolonu yazdirin
        List<WebElement> dataElementList3Colon = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][3]"));
        System.out.println("line numbers ");
        for (WebElement eachElement : dataElementList3Colon) {
            if (!eachElement.getText().isBlank()) {
                System.out.println(eachElement.getText());
            }

        }
//        9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        List<WebElement> namesColonElementsList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][1]"));
        List<WebElement> salaryColonElementsList = driver.findElements(By.xpath("//div[@class='rt-tr-group']//div[@class='rt-td'][5]"));

        String seachedPerson = "Alden";
        for (int i = 0; i < namesColonElementsList.size(); i++) {
            if (namesColonElementsList.get(i).getText().equals(seachedPerson)) {
                System.out.println(seachedPerson + " of salary : " +
                        salaryColonElementsList.get(i).getText());
            }

        }

//        10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
//        sayisini girdigimde bana datayi yazdirsin

    }
}
