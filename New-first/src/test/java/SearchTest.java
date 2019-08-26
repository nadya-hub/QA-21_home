import com.telran.selenium.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchTest extends TestBase {

    @Test
        public void searchWikiTest() throws InterruptedException {
        driver.get("https://en.wikipedia.org");
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("selenium"+ Keys.ENTER);
       // driver.findElement(By.name("go")).click();
        Thread.sleep(6000);
    }
}
