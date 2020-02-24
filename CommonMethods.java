package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	public static void  selection(WebDriver  driver, String locator, String Text) {
		
		driver.findElement(By.xpath(locator)).sendKeys(Text);
		
	}
	public static void  DatePicker(WebDriver driver,String locator,String year,String month,String day,String year1,String month1,String day1) throws InterruptedException
	{
		WebElement claender = driver.findElement(By.xpath(locator));
		claender.click();
		WebElement currentYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]"));
		if(!currentYear.equals(year))
		{
			do
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			}while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().equals(year));
			
			
		}
		System.out.println("done with year");
		 String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		if(!currentmonth.equalsIgnoreCase(month))
		{
			do
			{
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
			
			}while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(month));
			
		}

		System.out.println("done with month");
		
		//List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	//	int totalDates = dates.size();
//System.out.println(totalDates);

WebElement claender1 = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
	 List<WebElement> dates = claender1.findElements(By.xpath("//a[@class='ui-state-default']"));
	for (WebElement sdate: dates)
	{
		if(sdate.getText().equals(day))
		{
			sdate.click();
			break;
			
		}
	}
	
	Thread.sleep(2000);
	WebElement calender1 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
	calender1.click();
	System.out.println("done with second calender");
	
	WebElement currentYear1 = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]"));
	if(!currentYear1.equals(year1))
	{
		do
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		}while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']")).getText().equals(year1));
		
		
	}
	System.out.println("done with year");
	Thread.sleep(2000);
	 String currentmonth1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	if(!currentmonth1.equalsIgnoreCase(month1))
	{
		do
		{
			driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
		
		}while(!driver.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]")).getText().trim().equalsIgnoreCase(month1));
		
	}

	System.out.println("done with month");
	
	WebElement calender2 = driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
	 List<WebElement> dates1 = calender2.findElements(By.xpath("//a[@class='ui-state-default']"));
	for (WebElement sdate: dates1)
	{
		if(sdate.getText().equals(day1))
		{
			sdate.click();
			break;
			
		}
	}
	
	
	/*Select s = new Select(driver.findElement(By.xpath("//div[@class='row1 adult-infant-child'")));
	
	
	System.out.println("done with selection");
	s.selectByValue("2");
	Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
	System.out.println("done with selection2");
	s1.selectByIndex(1);	
	Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	System.out.println("done with selection3");
	s2.selectByIndex(1);	
	*/
	}
	public static void pass(WebDriver driver,String ad,String ch,String in) throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")).click();
		Thread.sleep(2000);
		List<WebElement> adult = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']//option"));
		System.out.println("got Adult");
		for(WebElement we1:adult)
		{
			if(we1.getText().equals(ad))
			{
				we1.click();
				break;
			}
		}
		System.out.println("adult selected");
		
		List<WebElement> child = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']//option"));
		System.out.println("got child");
		
		for(WebElement we1:child)
		{
			if(we1.getText().equals(ch))
			{
				we1.click();
				 
				break;
			}
		}
		
		System.out.println("child selected");
		List<WebElement> infant = driver.findElements(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']//option"));
		System.out.println("got Infant");
		for(WebElement we1:infant)
		{
			if(we1.getText().equals(ad))
			{
				we1.click();
				break;
			}
		}
		System.out.println("infant selected");
		
		
		
	}
	
	
	public static void currency(WebDriver driver,String locator,String locator1,String curr) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath(locator)).click();
		Thread.sleep(2000);
		List<WebElement> currency = driver.findElements(By.xpath(locator1));
		for(WebElement we1:currency)
		{
			if(we1.getText().equalsIgnoreCase(curr))
			{
				we1.click();
				break;
			}
		}
		
	}
	
		
	public static void onclick(WebDriver driver,String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}	
				
	}

