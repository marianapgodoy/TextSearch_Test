package pages;

import base.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends Page {
	
	
	private final String SEARCHBOX_NAME = "search_block_form";
	private final String SUBMITSEARCH_NAME = "submit";
	
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	
	public void setSearchBoxText(String text) {
		try{
		 driver.findElement(By.name(SEARCHBOX_NAME)).sendKeys(text);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void submitSearch() {
		driver.findElement(By.name(SUBMITSEARCH_NAME)).click();
	}

	
}