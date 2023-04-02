package A02SeleniumPratiques;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseMethod;

public class Q17_WebElement extends TestBaseMethod {
    @Test
    public void test01() throws Exception {
//        1- C01_TekrarTesti isimli bir class olusturun
//        2- https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/");

//        3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//*[text()='Tout accepter']")).click();

//        4- Sayfa basliginin “Google” ifadesi icerdigini test edin

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//        5- Arama cubuguna “Nutella” yazip aratin
        WebElement search1= driver.findElement(By.xpath("//*[@title='Rechercher']"));
        search1.sendKeys("Nutella"+ Keys.ENTER);
//        6- Bulunan sonuc sayisini yazdirin
        WebElement result1=driver.findElement(By.xpath("//*[@id='result-stats']"));
        String str=result1.getText();
        System.out.println(str);
//        7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin

        String numberStr = str.substring(7, 20).replaceAll("[^\\d]", "");

        long number = Long.parseLong(numberStr);
        System.out.println(number);
        /*
        substring() metodu, bir String'in belirtilen iki indis arasındaki alt dizesini alır.
        İlk parametre başlangıç dizini (bu dizin dahil), ikinci parametre ise bitiş dizinidir
        (bu dizin hariç). Bu nedenle, yukarıdaki kodda str.substring(7, 20) ifadesi, "Environ
        " ve " résultats" kelimelerini atlamak için "159 000 000" sayısının başlangıç
        ve bitiş dizinlerini belirtir. İlk dizin 7 olarak seçilir, çünkü "Environ " ifadesinde
        7 karakter vardır. İkinci dizin 20 olarak seçilir, çünkü "159 000 000" ifadesinde
        13 karakter vardır ve 7 + 13 = 20'dir. Bu nedenle, substring(7, 20) ifadesi, "Environ " ve "
        résultats" kelimeleri hariç sadece sayıyı içeren alt dizesi döndürür.
         */
        if (number>10000000){
            System.out.println("10 milyondan fazla");
        }else {
            System.out.println("10 milyondan az");
        }

//        8- Sayfayi kapatin
    }
}
