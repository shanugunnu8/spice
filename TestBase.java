package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.CommonMethods;
import generic.Locators;

public class TestBase implements Locators {
	static
	{
		System.setProperty("webdriver.chrome.driver", "../Gen/drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		CommonMethods.onclick(driver, roundTrip);
		CommonMethods.selection(driver, source,"Pune");
		CommonMethods.selection(driver, destination	,"Mumbai");
		CommonMethods.DatePicker(driver, calender, "2020", "May", "20","2020","June","15");
		CommonMethods.pass(driver, "2", "2", "2");
		CommonMethods.currency(driver, currencies, currencOption, "USD");
		CommonMethods.onclick(driver, submit);
		driver.close();
		
	}

}
