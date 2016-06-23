package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestSuiteSetup;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTextTest extends TestSuiteSetup{	
	
	HomePage homePage;
	SearchResultsPage searchResultPage;
	
	
	@BeforeClass(alwaysRun = true)
	public void setup(){
		homePage = new HomePage(getDriver());
		searchResultPage = new SearchResultsPage(getDriver());
		
	}	
	
	@Test
	public void searchText()
	{
				
		String searchTerm = "cosugi 2016";
		String expectedURL = "http://www.sirsidynix.com/blog/2016/05/09/your-cosugi-compendium-everything-you-need-to-know-about";
		
		System.out.println("Home Page:Entering text in Search box ");
		homePage.setSearchBoxText(searchTerm);
		homePage.submitSearch();
		System.out.println("Search Results Page: Opening specific link");
		searchResultPage.openSearchLink();
		System.out.println("Assertion: expected and actual urls shoul match");
		Assert.assertEquals(searchResultPage.getURL().toString(), expectedURL);
		
	}
	

			
			
}