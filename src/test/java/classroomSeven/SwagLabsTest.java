package classroomSeven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsTest {

    WebDriver driver;
    private final String SWAGLABS_URL = "https://www.saucedemo.com/";

    @BeforeMethod (alwaysRun = true)
    public void openBrowser() throws InterruptedException {
        System.out.println("atver testu");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebElement userNameInputField = driver.findElement(By.id("user-name"));
        userNameInputField.sendKeys("Ingrida_Mezecka");
        Thread.sleep(5000);
        System.out.println("izpilda testu");

    }

    @Test
     public void testErrorMessage(){
        System.out.println("izpilda");

        driver.get(SWAGLABS_URL);
    }
    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        //aizver brouseri
        driver.close();
        System.out.println("aizver ");
    }





    }
