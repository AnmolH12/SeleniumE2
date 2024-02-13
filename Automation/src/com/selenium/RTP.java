package com.selenium;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RTP {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
    	
    	 System.out.println("Enter the Browser Name");
    	 
    	  Scanner sc = new Scanner(System.in);
          String browserValue = sc.next();
          
          if(browserValue.equalsIgnoreCase("chrome"))
          {	 
          System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          Thread.sleep(5000);
          driver.close();
          }
          else if(browserValue.equalsIgnoreCase("firefox"))
          {
        	  System.setProperty("webdriver.firefox.driver", "./Driver/firefoxdriver.exe");
              driver = new FirefoxDriver();
              driver.manage().window().maximize();
              driver.get("https://www.youtube.com/watch?v=dS2Mt1_orSs");
              Thread.sleep(5000);
              driver.close();  
              
          }
          else if(browserValue.equalsIgnoreCase("edge"))
          {
        	  System.setProperty("webdriver.edge.driver","./Driver/edgedriver.exe");
        	  driver = new EdgeDriver();
        	  driver.manage().window().maximize();
        	  Thread.sleep(5000);
        	  driver.close();
          }
          else 
          {
        	  System.out.println("Enter valid Browser");
          }
          
    }

	}
    	
      
        