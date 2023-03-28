package ders01_SeleniumaGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//        1. Yeni bir package olusturalim : day01
//        2. Yeni bir class olusturalim : C03_GetMethods
public class C06Question01 {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
//        3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());
//        5. Sayfa basliginin “Amazon” icerdigini test edin
       String expectedTitle="Amazon.com";
       String actualTitle=driver.getTitle();
       if (actualTitle.contains(expectedTitle)){
           System.out.println("Title contains amazon");
       }else {
           System.out.println("Title not contain amazon");
       }
//        6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

//        7. Sayfa url’inin “amazon” icerdigini test edin.

        String expectedText="amazon";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedText)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Url is not contains expectedText");
        }
//        8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

//        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String expectedContext="alisveris";
        String actualContext=driver.getPageSource();
        if (actualContext.contains(expectedContext)){
            System.out.println("Page source contains alisveris");
        } else {
            System.out.println("Page source not contains alisveris");
        }
//        10. Sayfayi kapatin.
        driver.close();

        /*
        Amazon.com. Spend less. Smile more.
        Title contains amazon
        https://www.amazon.com/
        Test Passed
        F58D7159BEC2D92ABC4190500A08FCE8
        Page source contains shop
         */

    }
}
