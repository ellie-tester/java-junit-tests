package class4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static utilities.Webutils.*;


public class TakeScreenShot {
    @Test
    public void test(){

        driver.get("https://demo.automationtesting.in/Register.html");
        takeScreenshot();
        takeScreenshotOfWebElement( By.xpath("//img[@id='imagetrgt']"));
}


}
