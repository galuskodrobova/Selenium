import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class MainTest extends BaseUtils {
    WebDriver driver = new ChromeDriver();


    @Test
    public void firstSeleniumTest() throws InterruptedException {
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");

        Thread.sleep(1000);
        searchButton.click();

        searchBox =  driver.findElement(By.name("q"));
        Assert.assertEquals(searchBox.getAttribute("value"), "Selenium"); // => "Selenium"
    }


    @AfterMethod
    public void Close(){
        driver.quit();
    }
}

