package Smoke;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
       
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        WebDriver driver = new ChromeDriver(options);
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(options);
        System.out.println("In test 1");
        driver.get("http://google.com");
        String expectedPageTitle = "Google";
        Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Test Failed after execution");
        driver.quit();
    }
}
