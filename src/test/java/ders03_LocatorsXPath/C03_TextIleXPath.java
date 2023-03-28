package ders03_LocatorsXPath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C03_TextIleXPath {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Test PASSED");

        }else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(5000);
        //4- Delete tusuna basin
        deleteButonu.click();
        Thread.sleep(2000);

        WebElement addRemove=driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        if (addRemove.isDisplayed()) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
