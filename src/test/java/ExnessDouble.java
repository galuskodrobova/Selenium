import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExnessDouble {

    @Ignore
    @Test
    public void exnessTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver d = new ChromeDriver();

        d.get("https://www.exness.com/");
        d.findElement(By.className("c591")).click();
        d.findElement(By.className("c617")).click();

        String currentHandle= d.getWindowHandle();
        d.findElement(By.xpath("//span[@class='c176'][text() = 'Sign in']")).click();

        Set<String> tabs = new HashSet<String>(d.getWindowHandles());
        List<String> listOfTabs = new ArrayList<String>(tabs);
        d.switchTo().window(listOfTabs.get(1));
        d.findElement(By.xpath("//input[@name = 'login']")).sendKeys("jhsdbjhas@kjnv.com");

        d.findElement(By.xpath("//a[@class = 'We8R9oQvHirB8JUpBnHbW']")).click();

        tabs = d.getWindowHandles();
        listOfTabs = new ArrayList<String>(tabs);
        d.switchTo().window(listOfTabs.get(2));
        String s = d.findElement(By.xpath("//h3[text() = 'Cyprus']")).getText();
        System.out.println(s);
        d.switchTo().window(listOfTabs.get(0));
        s = d.findElement(By.xpath("//h2[@class='c97 c103'][text() = 'Instant withdrawals, 24/7']")).getText();
        System.out.println(s);
    }
}



