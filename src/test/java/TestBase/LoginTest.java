package TestBase;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Utils;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

public class LoginTest extends Base {
     WebDriver driver;
     Logger log= Logger.getLogger(String.valueOf(LoginTest.class));
     Utils utils;

  public LoginTest() throws IOException {
      super();
   utils= new Utils();


  }
 @Parameters("browser")
  @BeforeMethod
   public void setUp(String browser){
//   initialization();
     if(browser.equalsIgnoreCase("chrome")){
         driver=new ChromeDriver();
     } if(browser.equalsIgnoreCase("firefox")) {
         driver = new FirefoxDriver();
     }    driver.manage().deleteAllCookies();
     driver.manage().window().maximize();
     log.info("Maximizing thee window");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
     driver.get(prop.getProperty("url"));
     log.info("Opening the Orange HRMS");
  }
    @Test(priority = 1)
    public void logo() throws InterruptedException {
      //driver.get(prop.getProperty("url"));
        Thread.sleep(3000);
        WebElement logo= driver.findElement(By.xpath("//img[@alt='company-branding']"));
        log.info("Finding the company logo");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        Assert.assertTrue(logo.isDisplayed());

    }

    @Test(priority = 2, enabled = false)
    public void login() throws InterruptedException {
       WebElement userName= driver.findElement(By.xpath("//div//div[2]//div[2]//div//div//p[1]"));
       String userNameInput= userName.getText();
       String splitUserName[] =userNameInput.split(": ");
        Thread.sleep(2000);
       WebElement password= driver.findElement(By.xpath("//div//div[2]//div[2]//div//div//p[2]"));
       String pwdInput = password.getText();
        String splitPwdName[] =pwdInput.split(": ");
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys(splitUserName[1]);
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(splitPwdName[1]);
       Thread.sleep(2000);
//       Utils.implicitWait();
       driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 3,enabled = true, dataProvider = "login")
    public void dataLogin(String uname, String pwd){
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
        log.info("Finding the username and entering text");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
        log.info("Finding the password field entering text");
    }

    @DataProvider(name="login")
    Object[][] loginData()
    {
        String data[][]={{"vinisha","admin"},{"Admin","admin123"}};
        return data;
    }
}
