package com.banking;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest
{
    WebDriver driver;
    ExtentReports extent;
    @BeforeTest
    public void TestInit() {
        extent = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Users\\ADISH\\Desktop\\testing EcoFy\\bank\\test-report\\report.html");
        extent.attachReporter(reporter);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setDocumentTitle("Test Report");
    }

    @BeforeMethod
    public void testsetup() throws IOException{
        FileInputStream fs = new FileInputStream("C:\\Users\\ADISH\\Desktop\\testing EcoFy\\dbank.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet("login");

        XSSFRow row = sheet.getRow(1);
        String username = row.getCell(0).getStringCellValue();
        String password = row.getCell(1).getStringCellValue();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys(username);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/input")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/label/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    
    @Test
    public void Test1() {
        ExtentTest test1 = extent.createTest("Test 1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        if (driver.getCurrentUrl().contains("home")) {
            test1.log(Status.PASS, "Test 1 : Pass");
        } else {
            test1.log(Status.FAIL, "Test 1 : Fail");
        }
    }

    @Test
    public void Test2() {
        ExtentTest test1 = extent.createTest("Test 2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        if (driver.getCurrentUrl().contains("home123")) {
            test1.log(Status.PASS, "Test 2 : Pass");
        } 
        
        else {
            test1.log(Status.FAIL, "Test 1 : Fail");
        }
    }
    @AfterMethod
    public void testClose() {
        driver.close();
    }

    @AfterTest
    public void destTest() {
        extent.flush();
    }
}
