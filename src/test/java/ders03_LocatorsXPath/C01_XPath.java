package ders03_LocatorsXPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     /*
            Su ana kadar gordugumuz 6 locator
                - id
                - name
                - classname
                - tagname
                - linkText
                - partialLinkText
            Webelement'in HTML kodlarina baglidir.
            HTML kod istenen ozelliklerde degilse
            bu locator'lari kullanarak, unique bir locate yapamayabiliriz
            Bizim her webelementi unique olarak locate edebilecek
            COK GUCLU bir locator'a ihtiyacimiz var
         */
    }
}
