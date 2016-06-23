package pages;

import base.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultsPage extends Page {

	private final String SEARCHRESULT_HREF = "Your COSUGI Compendium: Everything You Need to Know About Indianapolis, part 2 The Dish on Dining";
	
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
		
	public void openSearchLink() {
			
			driver.findElement(By.partialLinkText(SEARCHRESULT_HREF)).click();
			
		}
		
		
	}


