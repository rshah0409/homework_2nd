package newwebsite;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
/*Homework – 2
Navigate to website "https://demo.nopcommerce.com/"
Click on register link.
Fill the all fields.
Click on register button.
Verify that the user register successfully.
*/

public class HomeWork_2 {
  static  WebDriver driver;
    @BeforeClass

    public static void nevigateToNopCommerceWebPage() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty( "webdriver.edge.driver", "drivers/msedgedriver.exe" );
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 80, TimeUnit.SECONDS );
        driver.get( baseUrl );
    }
       @Test
        public  void clickOnRegisterTab(){

        WebElement registerLink=driver.findElement( By.xpath("//a[@class='ico-register']") );
        registerLink.click();
    }
    @Test
    public void fillInAllFields(){
        WebElement registerLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerLink.click();
        WebElement clickOnFieldGender = driver.findElement(By.xpath("//input[@id='gender-female']"));
        clickOnFieldGender.click();
        WebElement enterFirstName=driver.findElement(By.xpath("//input[@id='FirstName']"));
        enterFirstName.sendKeys("Prime");
        WebElement enterLastName=driver.findElement(By.xpath("//input[@id='LastName']"));
        enterLastName.sendKeys("Testing");
        WebElement enterDateOfBirth=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        enterDateOfBirth.sendKeys("12");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("Dec");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1999");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc@456.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("The Best Company");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
       // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.quit();







    }

}
