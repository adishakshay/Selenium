package com.webelement;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
    
    @Test
    public void test1() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.moneycontrol.com/");
        driver.manage().window().maximize();
        Thread.sleep(17000);
        driver.findElement(By.xpath("/html/body/div[3]/header/div[1]/div[1]/div/div/div[2]/div/div/form/input[5]")).sendKeys("indian bank",Keys.ENTER);
        Thread.sleep(7000);
        driver.close();

    }
}

// package Demoblaze_Test;

// import java.net.MalformedURLException;
// import java.net.URL;
// import java.time.Duration;
// import java.util.List;

// import org.openqa.selenium.Alert;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.remote.RemoteWebDriver;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.Test;

// import utils.EventHandler;

// import org.testng.annotations.AfterMethod;
// import org.openqa.selenium.support.events.EventFiringDecorator;
// import org.openqa.selenium.support.events.WebDriverListener;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;


// public class Test_demoblaze{
//     public static WebDriver driver;
//     public final int IMPLICIT_WAIT_TIME=10;
//     public final int PAGE_LOAD_TIME=5;
// @BeforeMethod
//     public WebDriver beforeMethod() throws MalformedURLException{
//         ChromeOptions chromeOptions = new ChromeOptions();
//         driver = new RemoteWebDriver(new URL("http://localhost:4444/"), chromeOptions);
//         driver.get("https://www.demoblaze.com/");
//          WebDriverListener listener = new EventHandler();
//         driver = new EventFiringDecorator<>(listener).decorate(driver);
//         return driver;

//     }
//         @Test
//         public void TestLocators() throws InterruptedException {
//         driver.get("https://www.demoblaze.com/");
//         driver.manage().window().maximize();
//         // driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
//         driver.findElement(By.linkText("Laptops")).click();
//         Thread.sleep(3000);
//         driver.findElement(By.linkText("MacBook air")).click();
//         // driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[3]/div/div/h4/a")).click();
//         Thread.sleep(3000);
//         driver.findElement(By.linkText("Add to cart")).click();
//         Thread.sleep(2000);
//         driver.switchTo().alert().accept();
//         driver.findElement(By.linkText("Cart")).click();
//         Thread.sleep(5000);
//         String title = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[2]")).getText();
//         String price = driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr/td[3]")).getText();
//         System.out.println(title + price);
     
//     }
// }
