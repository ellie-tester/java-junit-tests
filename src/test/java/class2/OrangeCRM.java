package class2;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.StaleElementReferenceException;
import java.util.List;
import static class2.LoginTest.driver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrangeCRM{
    @BeforeAll
    public static void LoginTest() throws InterruptedException {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
    }

    @Test
    @Order(1)
    public void systemUsersSearchFunctionality() throws InterruptedException {
        String usernameForSearch = "Admin";
        Thread.sleep(3000);

        WebElement adminButton = driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
        adminButton.click();

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//label[.='Username']/parent::div/following-sibling::div/input"));
        username.sendKeys(usernameForSearch);

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();
    }

    @Test
    @Order(2)
    public void addNewUserFunctionalityTesting() throws InterruptedException {
        Thread.sleep(3000);

        WebElement adminButton = driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
        adminButton.click();

        Thread.sleep(2000);

        WebElement addNewUserBtn = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
        addNewUserBtn.click();

        // Click User Role dropdown
        Thread.sleep(2000);
        WebElement userRoleDropDown = driver.findElement(By.xpath("//label[contains(text(), 'User Role')]/parent::div/following-sibling::div"));
        userRoleDropDown.click();

        // Select Admin from dropdown
        WebElement adminOptionUserRole = driver.findElement(By.xpath("//div[@role='listbox']/div[2]"));
        adminOptionUserRole.click();

        // Click Status dropdown
        WebElement statusDropDown = driver.findElement(By.xpath("//label[contains(text(), 'Status')]/parent::div/following-sibling::div"));
        statusDropDown.click();

        try {
            Thread.sleep(2000);
            List<WebElement> statusDropDownOptionsList = driver.findElements(By.xpath("//div[@role='listbox']//span"));

            for (WebElement option : statusDropDownOptionsList) {
                Thread.sleep(500);
                String optionText = option.getText();

                if (optionText.equalsIgnoreCase("Enabled")) {
                    option.click();
                    break;
                }
            }

        } catch (StaleElementReferenceException staleElementReferenceException) {
            System.out.println("Stale element reference: " + staleElementReferenceException.getMessage());
        }

        // Enter employee name
        WebElement employeeNameInputField = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        String employeeName = "John";
        employeeNameInputField.sendKeys(employeeName);
        Thread.sleep(2000);

        WebElement listedEmployeeName = driver.findElement(By.xpath("//div[@role='listbox']//span"));
        System.out.println("Found employee name is: " + listedEmployeeName.getText().toUpperCase());
        listedEmployeeName.click();
    }

    @AfterAll
    public static void closeAndQuitTheBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}


