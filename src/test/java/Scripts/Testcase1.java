package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import POM.Home_page;
import POM.Laptop_Cart;
import POM.Laptop_page;

public class Testcase1 extends BaseClass {

	@Test
	public void tc1() throws InterruptedException, IOException
	{
		Home_page h= new Home_page(driver);
		h.searchboxMethod(pdata.getPropertyFile2("searchtext"));
		h.searchbuttonMethod();
		
		Laptop_page lp= new Laptop_page(driver);
		wb.switchtabs(driver);
		lp.Laptopmethod();
		
		Laptop_Cart lc= new Laptop_Cart(driver);
		wb.switchtabs(driver);
		lc.buynowmethod();
		Thread.sleep(3000);
	}
}
