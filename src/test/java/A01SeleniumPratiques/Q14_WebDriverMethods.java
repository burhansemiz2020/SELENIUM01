package A01SeleniumPratiques;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseMethod;

public class Q14_WebDriverMethods extends TestBaseMethod {
    String https="https://www.";
    @Test
    public void test01() {
//        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
//        doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get(https+"youtube.com");
        String expectedTitle="youtube";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actual title is : " +actualTitle);
        }
//        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
//        doğru URL'yi yazdırın.
        String expectedUrl="youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actualUrl is : " + actualUrl);
        }
//        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get(https+"amazon.com");
//        5. Youtube sayfasina geri donun
        driver.navigate().back();
//        6. Sayfayi yenileyin
        driver.navigate().refresh();
//        7. Amazon sayfasina donun
        driver.navigate().forward();
//        8. Sayfayi simgedurumuna getirin
        driver.manage().window().minimize();
//        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
//                Yoksa doğru başlığı(Actual Title) yazdırın.
        String expectedTitle2="Amazon";
        String actualTitle2 = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actual title is : " +actualTitle);
        }
//        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
//        doğru URL'yi yazdırın
        String expectedUrl2="https://www.amazon.com/";
        String actualUrl2 = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED, actualUrl is : " + actualUrl);
        }
//        11.Sayfayi kapatin
        driver.close();

    }
}
