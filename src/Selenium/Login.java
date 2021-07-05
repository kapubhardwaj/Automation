package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends OpenBrowser {
    public static WebDriver main () throws InterruptedException {

        WebDriver drv= browser();
        drv.get("https://qatest.fareye.co");
        Thread.sleep(15000);
        /* Entering username */
        drv.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/span/input")).sendKeys("qaonly_admin");
        drv.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/button")).click();
        Thread.sleep(3000);
        /* Entering password */
        drv.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/span/input")).sendKeys("admin");
        drv.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/button")).click();
       Thread.sleep(15000);
      String url=drv.getCurrentUrl();
      System.out.println("User logged into :"+ url);
      if(url.equals("https://qatest.fareye.co/v1/#/dashboardV2")){
          System.out.println("User logged in successfully");
//          drv.quit();
      } else{
          System.out.println("Login is failed");
        }
      return drv;

        //String title= drv.getTitle();
       //System.out.println(title);
       //if (title.equals("Dashboard")){
         //  System.out.println("User logged in successfully");
       //}
       //else if (title.equals("Administrator Panel")){
         //  System.out.println("Dashboard page is loading");
       //}


    }
}

