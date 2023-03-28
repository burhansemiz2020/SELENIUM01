package ders01_SeleniumaGiris;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C05_IlkTest {
    public static void main(String[] args) {
        /*
        gerekli ayarlamalari yapip driveri olusturun
        sonra amazon ana sayfaya gidin sonra amazon
        anasayfaya gittiginiziz test edin.
         */
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        //amazon sayfasina gittigimizi test edecegiz.
        //expected ile actual degerin ayni olup olmadigini
        //test etmek icin asagidaki kodlari yazariz
        //bize testi nasil yapacagimiz soylenmediginden kendimiz yontem belirleriz.
        //burada biz url in amazon icerdigini kontrol edecegiz
        String expectedMetin="amazon";
        String actualUrl= driver.getCurrentUrl();
                if (actualUrl.contains(expectedMetin)) {
                    System.out.println("Test Passed");
                }else{
                    System.out.println("Url istenen metni icermiyor TEST FAILED");
                }


    }
}
