package class3;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.Webutils.clickElement;
import static utilities.Webutils.driver;

public class TableTest {

    @Test
    public void tableTest(){

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']")));
        WebElement pimMenu1 = pimMenu;
        pimMenu1.click();

//        clickElement(By.xpath("//table[@id='customers']//tr[2]/td[1]/input"), Duration.ofSeconds(5));
    }

}
