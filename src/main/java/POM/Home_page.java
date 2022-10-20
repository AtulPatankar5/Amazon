package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	//declaration 
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchbutton;
	
	//initialization
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void searchboxMethod(String name )
	{
		searchbox.sendKeys(name);
	}

	public void searchbuttonMethod() { 
		searchbutton.click();
	}
}
