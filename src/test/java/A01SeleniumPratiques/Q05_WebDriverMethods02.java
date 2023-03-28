package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q05_WebDriverMethods02 {
    public static void main(String[] args) throws InterruptedException {

        //1. Using EdgeDriver, go to the Facebook page
        //and verify that the page title is "Facebook".
        //If it's not, print the correct title.
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.facebook.com");
        String expectedPage="Facebook - log in or sign up";
        String actualPage= driver.getTitle();
        if (actualPage.equals(expectedPage)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println(actualPage);
        }
        //2. Verify that the page URL contains the word "facebook".
        // If it doesn't, print the actual URL.
        String expectedUrl="facebook";
        String actualUrl=driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println(actualUrl);
        }
        Thread.sleep(2500);
        //3. Go to https://www.walmart.com/ page.
        driver.get("https://www.walmart.com");
        //4. Verify that the page title contains "Walmart.com".
        String expectedPage2 = "Walmart.com";
        String actualPage2= driver.getTitle();
        if (actualPage2.contains(expectedPage2)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(2500);
        //5. Go back to the "Facebook" page again.
        driver.navigate().back();
        //6. Refresh the page.
        driver.navigate().refresh();
        //7. Maximize the page.
        driver.manage().window().maximize();
        //8. Close the browser.
        driver.close();


    }
}
