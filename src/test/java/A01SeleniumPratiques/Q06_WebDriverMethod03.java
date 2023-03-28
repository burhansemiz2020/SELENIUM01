package A01SeleniumPratiques;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q06_WebDriverMethod03 {
    public static void main(String[] args) throws InterruptedException {
        //1. Go to the Youtube webpage and verify
        // if the page title is "youtube", if not,
        // print the correct title (Actual Title) in the console.
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

        driver.get("https://www.youtube.com");
        String expectedTitle="youtube";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
            System.out.println(actualTitle);
        }
        //2. Verify if the page URL contains "youtube",
        // if it doesn't, print the correct URL.
        String expectedUrl="youtube";
        String actualUrl= driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println(actualUrl);
        }
        Thread.sleep(2500);
        //3. Then, go to the Amazon page at https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2500);
        //4. Go back to the Youtube page.
        driver.navigate().back();
        //5. Refresh the page.
        driver.navigate().refresh();
        //6. Go to the Amazon page.
        driver.navigate().forward();
        //7. Maximize the page.
        driver.manage().window().maximize();
        //8. Verify if the page title contains "Amazon",
        // if not, print the correct title (Actual Title).
        String expectedTitle2="Amazon";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.equals(expectedTitle2)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println(actualTitle2);
        }
        //9. Verify if the page URL is https://www.amazon.com/,
        // if not, print the correct URL.
        String expectedPageUrl="https://www.amazon.com/";
        String actualPageUrl=driver.getCurrentUrl();
        if (actualPageUrl.equals(expectedPageUrl)) {
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
            System.out.println(actualPageUrl);
        }
        Thread.sleep(2500);

        //10. Close the page.
        driver.close();
    }
}
