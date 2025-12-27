package class2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    static WebDriver driver = new ChromeDriver();

    @Test
    public void setup() {
        driver.navigate().to("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
       fullName.sendKeys("Elnura Musaeva");

        WebElement email  = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("elnura.musaeva777@gmail.com");

        WebElement textarea = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        textarea.sendKeys("550 N Figueroa St");

        WebElement textarea1 = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        textarea1.sendKeys("Osh, Kyrgyzstan");

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
         submit.click();

    }
}
