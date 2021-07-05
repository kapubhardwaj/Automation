package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class OrderCreate extends Login{
    public static void main (String args[]) throws InterruptedException {
        WebDriver drv= main();
        drv.findElement(By.xpath("/html/body/div/nav/div/div/div[2]/ul[1]/li[6]/a/span")).click();
        drv.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        drv.findElement(By.xpath("/html/body/div/div[7]/aside/div/ul/li[5]/a")).click();
       // Thread.sleep(8000);
        System.out.println("User is at tab: "+drv.getTitle());
        drv.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

        drv.findElement(By.xpath("/html/body/div/div[7]/aside/aside/div/div/div/div/div[1]/div[1]/button")).click();
        drv.findElement(By.xpath("/html/body/div[1]/div[7]/aside/aside/div/div/div/div/form/ng-include/div[3]/div/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("RefNos");
       // drv.quit();

    }
}
