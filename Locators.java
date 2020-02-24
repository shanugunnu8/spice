package generic;

import org.openqa.selenium.By;

public interface Locators {
	
	String 	source = "//input[@id ='ctl00_mainContent_ddl_originStation1_CTXT']";
	String  destination = "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']";
	String 	From =	"//button[@class='ui-datepicker-trigger']";
	//String  currentDate = "//td[@class='  ui-datepicker-today']";
	String calender ="//input[@id='ctl00_mainContent_view_date1']";
	String calender1 = "//input[@id='ctl00_mainContent_view_date2']";
	String  adult ="//select[@id='ctl00_mainContent_ddl_Adult']";
	String currencies ="//select[@id='ctl00_mainContent_DropDownListCurrency']";
	String currencOption ="//select[@id='ctl00_mainContent_DropDownListCurrency']//option";
	String submit ="//input[@id='ctl00_mainContent_btn_FindFlights']";
	String roundTrip ="//input[@id='ctl00_mainContent_rbtnl_Trip_1']";
	String roundTrip1 ="//input[@id='ctl00_mainContent_rbtnl_Trip_1']";
}
