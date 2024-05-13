package com.ecofy;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class AppTest 
{
    @Test
    public void test1()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://max-neo-selenium.netlify.app/");

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();
        // Thread.sleep(5000);
        // driver.findElement(By.xpath("/html/body/div[1]/form/span/input[1]")).sendKeys("ADISH A");
        // Thread.sleep(5000);
        // driver.findElement(By.xpath("/html/body/div[1]/form/span/input[2]")).sendKeys("727822tuad003@skct.edu.in");
        // driver.findElement(By.xpath("/html/body/div[1]/form/span/button")).click();
        // Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/a[1]/button")).click();
        // Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[4]")).click();
        // Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[1]")).sendKeys("ADISH A");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[2]")).sendKeys("727822tuad003@skct.edu.in");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[3]")).sendKeys("13072004");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[4]")).sendKeys("727822TUAD003");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[1]")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[1]/option[2]")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[2]")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[2]/option[8]")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[2]/input[1]")).sendKeys("ADISH_A");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[2]/input[2]")).sendKeys("1234");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[1]/div[3]/div[2]/input")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[2]/button")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[3]")).click();
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/input")).sendKeys("ADISH_A");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/input")).sendKeys("1234");
        // Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/button[1]")).click();
        // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
        driver.close();
    }
    
    // @Test
    // public void test2() throws InterruptedException
    // {
    //     WebDriverManager.firefoxdriver().setup();
    //     WebDriver driver = new FirefoxDriver();
    //     String url;
    //     driver.get(url:"https://www.google.com");

    //     driver.manage().window().maximize();
    //     driver.manage().window().fullscreen();

    //     Thread.sleep(millis:5000);
    //     driver.close();
    // }

    // @Test
    // public void test3() throws InterruptedException
    // {
    //     WebDriverManager.edgedriver().setup();
    //     WebDriver driver = new EdgeDriver();
    //     driver.get(url:"https://www.bing.com");

    //     driver.manage().window().maximize();
    //     driver.manage().window().fullscreen();

    //     Thread.sleep(millis:5000);
    //     driver.close();
    // }

}
