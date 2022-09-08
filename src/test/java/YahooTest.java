import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class YahooTest extends BaseUtils {

    WebDriver driver = new ChromeDriver();

    @Test
    public void yahooSearchTest() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

        driver.get("https://www.yahoo.com");

        WebElement searchBox = driver.findElement(By.name("p"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@name='p']"));

        searchBox.sendKeys("Kim Kardashian");

        Thread.sleep(3000);
        searchButton.click();

        searchBox = driver.findElement(By.name("p"));

        Assert.assertEquals(searchBox.getAttribute("value"), "Kim Kardashian");

    }

    @AfterMethod
    public void Close(){
        driver.quit();
    }
}
