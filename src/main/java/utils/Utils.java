package utils;

import Base.Base;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Utils extends Base {


    public Utils() throws IOException {
        this.driver= driver;
    }

    public static void holdExecution(int sec, WebElement ele){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By)ele));
    }

    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

//    public static CharSequence readFromExcel() throws IOException {
//        FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"src//test//java//TestData//testdata.xlsx");
//        XSSFWorkbook wb= new XSSFWorkbook(file);
//        XSSFSheet sheet= wb.getSheet("sheet1");
//        XSSFRow row= sheet.getRow(1);
//        XSSFCell cell1  =row.getCell(0);
//        XSSFCell cell2= row.getCell(1);
//        String username= cell1.toString();
//        String password= cell2.toString();
//    }



}
