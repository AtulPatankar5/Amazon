package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laptop_page {

	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement laptop;
	
	public Laptop_page(WebDriver driver)
	{	
		PageFactory.initElements(driver,this);
	}
	
	public void Laptopmethod()
	{
		laptop.click();
	}
	
}
