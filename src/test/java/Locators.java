import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();  // Use driver consistently
        driver.get("http://google.com");

        // Wait for the page to load and element to be present if needed
        WebElement link = driver.findElement(By.linkText("Store"));

        // Click on the link instead of sendKeys
        link.click();

        // Always good practice to close the browser after the test
        driver.quit();
    }
}
