package org.pagespom;

import java.io.IOException;
import org.baseclass.BaseclassMethods;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Mainclass extends BaseclassMethods {
	@BeforeClass
	public static void beforeclass() {
		browserLaunch();
		enterApplnUrl("https://omrbranch.com/");
		maximizeWindow();
		setImplicitWait(driver, 120);
	}

	@Test
	public void orderplace() throws IOException, InterruptedException {
		// login
		Loginpage loginpage = new Loginpage();
		loginpage.login(getcelldata("Sheet1", 1, 0), getcelldata("Sheet1", 1, 1));

		// search product
		Searchproductpage searchproduct = new Searchproductpage();
		searchproduct.searchproduct();
		Assert.assertEquals("Verify the Msg Is Present", "Welcome Ganesh", searchproduct.txtgetmsg());

		// to add product to cart
		Productlistingpage productlist = new Productlistingpage();
		Assert.assertEquals("Verify the Msg Is Present", "Fruit & Nuts", productlist.msgfromproduct());
		productlist.product();

		// address and payment page
		Mycartpage cartpage = new Mycartpage();
		Assert.assertEquals("Verify the Msg Is Present", "My Cart", cartpage.messagecart());
		cartpage.mycart(getcelldata("Sheet1", 1, 3), getcelldata("Sheet1", 1, 4), getcelldata("Sheet1", 1, 5),
				getcelldata("Sheet1", 1, 6), getcelldata("Sheet1", 1, 7), getcelldata("Sheet1", 1, 8),
				getcelldata("Sheet1", 1, 9), getcelldata("Sheet1", 1, 10), getcelldata("Sheet1", 1, 11),
				getcelldata("Sheet1", 1, 12), getcelldata("Sheet1", 1, 13), getcelldata("Sheet1", 1, 14),
				getcelldata("Sheet1", 1, 15), getcelldata("Sheet1", 1, 16));
		Assert.assertEquals("Verify the Msg Is Present", "My Cart", cartpage.messagecart());

		// confirtmation page
		OrderConfirmationpage orderpage = new OrderConfirmationpage();
		SetCellData("Sheet1", 1, 17, orderpage.fororderid());
		Assert.assertEquals("Verify the Msg Is Present", "Order Details", orderpage.messageorder());

	}

	@AfterClass
	public static void afterclass() {
		quitWindow();
	}
}
