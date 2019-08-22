import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SearchTest {
    WebDriver driver;
    @Test
    public void searchWikiTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org");
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).sendKeys("selenium");
        driver.findElement(By.name("go")).click();
        Thread.sleep(6000);
        driver.quit();

    }
}
