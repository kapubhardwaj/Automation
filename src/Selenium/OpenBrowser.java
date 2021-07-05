package Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class OpenBrowser {
    public static WebDriver browser(){
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        String str;
        System.out.println("Please enter Chrome to open Chrome browser or Enter Firefox to open Mozila firefox browser");
        Scanner browser=new Scanner(System.in);
        str=browser.nextLine();

        if(str.equals("Chrome")){
            System.out.println("Opening Chrome Browser");
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        else if(str.equals("Firefox")){
            System.out.println("Opening Firefox");
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        }
        else{
            System.out.println("Please enter specific browser, User input is incorrect");
        }
        return null;
    }
}
