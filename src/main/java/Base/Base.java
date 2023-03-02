package Base;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

       public Base() throws IOException {
           FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\SampleFramework\\MyProject\\OCRM\\src\\main\\resources\\config.properties");
         prop = new Properties();
        prop.load(fis);



    }
// public static void initialization(){
//        String browserName= prop.getProperty("browser");
//        if(browserName.equalsIgnoreCase("chrome")){
//             driver= new ChromeDriver();
//        }
//        if(browserName.equalsIgnoreCase("firefox")){
//             driver= new FirefoxDriver();
//        }
//     driver.manage().deleteAllCookies();
//     driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//      driver.get(prop.getProperty("url"));
// }

}