package TestBase;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class listener implements ITestListener {

    WebDriver driver;
    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot ts= (TakesScreenshot)driver;
        File File= ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(File, new File("C:\\Users\\Lenovo\\IdeaProjects\\SampleFramework\\MyProject\\OCRM\\src\\test\\test.resources\\image.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
