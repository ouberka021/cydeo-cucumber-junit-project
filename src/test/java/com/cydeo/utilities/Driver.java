package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    private Driver(){}
    private static WebDriver driver; // default value = null

    public static WebDriver getDriver(){

        if(driver == null){

            String browserType = configurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    //    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    //   WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }

        }

        return driver;

    }
    public static void closeDriver(){
        if (driver!=null){

            driver.quit();

            driver = null;
        }
    }

}
