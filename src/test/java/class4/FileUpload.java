
package class4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

import static utilities.Webutils.driver;

public class FileUpload {

    @Test
    public void upload() {

        // 1. Open the file upload page
        driver.get("https://demo.automationtesting.in/FileUpload.html");

        // 2. Dynamically get the file path
        String filePath = System.getProperty("user.dir") + "/src/test/resources/upload-files/Upload.txt";

        // 3. Check if the file exists
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("❌ File not found: " + filePath);
            return; // Stop the test if file is missing
        } else {
            System.out.println("✅ File found: " + filePath);
        }

        // 4. Locate the file input element
        WebElement element = driver.findElement(By.xpath("//input[@id='input-4']"));

        // 5. Upload the file
        element.sendKeys(filePath);
    }
}
