import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExsnessTest {
    @Ignore
    @Test
    public void exsnessTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.exness.com/");
        driver.findElement(By.className("c591")).click();
        driver.findElement(By.className("c614")).click();

        driver.findElement(By.xpath("//span[@class='c176'][text() = 'Sign in']")).click();

        WebElement login = driver.findElement(By.xpath("//*[@name='login']"));

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        login.sendKeys("galuskodrobova@gmail.com");
        password.sendKeys("9999999999");

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));

        Thread.sleep(1000);
        submit.click();

        driver.quit();

    }
}
