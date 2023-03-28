package A01SeleniumPratiques;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Q08_Locators {
    public static void main(String[] args) {
        //1- Create a test class and configure the relevant settings.
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        //2- Go to https://www.automationexercise.com/.
        driver.get("https://www.automationexercise.com/");
        //3- Locate the elements in the Category section.
        WebElement Category01=driver.findElement(By.xpath("(//div[@class='panel panel-default'])[1]"));
        WebElement Category02=driver.findElement(By.xpath("(//div[@class='panel panel-default'])[2]"));
        WebElement Category03=driver.findElement(By.xpath("(//div[@class='panel panel-default'])[3]"));
        //4- Test that there are 3 elements in the Category section.
        WebElement Category= driver.findElement(By.xpath("//div[@class='panel-group category-products']"));
        int CategoryCount=Category.findElements(By.xpath("//div[@class='panel-group category-products']")).size();
        if (CategoryCount == 3) {
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        //5- Print the names of the categories.
        System.out.println(Category01);
        System.out.println(Category02);
        System.out.println(Category03);

        //6- Close the page.
        driver.close();
    }
}
