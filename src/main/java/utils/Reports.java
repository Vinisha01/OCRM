package utils;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

    String path= "C:\\Users\\Lenovo\\IdeaProjects\\SampleFramework\\MyProject\\OCRM\\src\\test\\test.resources\\index.html";
    ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    reporter.config().
}
