package com.demo;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	//初始化火狐浏览器
	public  void init() {
		FirefoxOptions options = new FirefoxOptions();
		
		 options.setBinary("D:\\tools\\Mozilla Firefox54\\firefox.exe");   
		 System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver(options);
		 //JavascriptExecutor jse = (JavascriptExecutor)driver; //加载jquery
		
		 String	baseUrl = "http://www.baidu.com";
		 driver.get(baseUrl);
		 
		 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);//设置页面加载时间
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//------元素等待时间（隐式等待）
	    // driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);//----脚本执行时间

	     
	    /* WebElement date1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[3]/div/div[2]/form/div/div[7]/div[2]/table/tbody/tr[2]/td[1]/span[1]/span"));
	     if(isPresentElement(date1 , By.xpath("/html/body/div[5]/div/div[3]/div/div[2]/form/div/div[7]/div[2]/table/tbody/tr[2]/td[1]/span[1]/span"))){
	    	 date1.click(); 
	     }
	     date1.click();
	     WebElement sj =driver.findElement(By.xpath("/html/body/div[18]/div/div/table/tbody/tr[3]/td[4]/a"));
	     sj.click();
	     
	   
	     
	     System.out.println("end");
	     */
	     
	}
	
	 private static boolean isPresentElement(WebElement driver,By by)
	    {
	        try {
	        	driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {   
	            return false;
	        }catch(Exception e){
	            return false;
	        }
	    }

	
	
}
