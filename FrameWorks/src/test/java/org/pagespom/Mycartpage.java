package org.pagespom;

import java.io.IOException;

import org.baseclass.BaseclassMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mycartpage extends BaseclassMethods {

	public Mycartpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='font35 font-weight-bold color11 text-center pageTitle']")
	private WebElement cartmsg;

	@FindBy(xpath = "//img[@src='https://omrbranch.com/front/images/plus.png']")
	private WebElement addnewaddress;

	@FindBy(id = "address_type")
	private WebElement txtaddresstype;

	@FindBy(name = "first_name")
	private WebElement txtfstname;

	@FindBy(name = "last_name")
	private WebElement txtlstname;

	@FindBy(name = "mobile")
	private WebElement txtmobileno;

	@FindBy(name = "apartment")
	private WebElement txtapartmentno;

	@FindBy(name = "address")
	private WebElement txtaddress;

	@FindBy(name = "state")
	private WebElement slctstate;

	@FindBy(name = "city")
	private WebElement slctcity;

	@FindBy(name = "zipcode")
	private WebElement txtpincode;

	@FindBy(xpath = "(//button[text()='Save'])[3]")
	private WebElement btnsaveaddress;

	@FindBy(id = "payment_type")
	private WebElement txtpaymenttype;

	@FindBy(xpath = "//label[text()=\" Master \"]")
	private WebElement cardtype;

	@FindBy(name = "card_no")
	private WebElement txtcardno;

	@FindBy(id = "month")
	private WebElement txtmonth;
	@FindBy(id = "year")
	private WebElement txtyear;

	@FindBy(name = "cvv")
	private WebElement txtcvv;

	@FindBy(id = "placeOrder")
	private WebElement btnplaceorder;

	// getters method

	public WebElement getCartmsg() {
		return cartmsg;
	}

	public WebElement getAddnewaddress() {
		return addnewaddress;
	}

	public WebElement getTxtaddresstype() {
		return txtaddresstype;
	}

	public WebElement getTxtfstname() {
		return txtfstname;
	}

	public WebElement getTxtlstname() {
		return txtlstname;
	}

	public WebElement getTxtmobileno() {
		return txtmobileno;
	}

	public WebElement getTxtapartmentno() {
		return txtapartmentno;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getSlctstate() {
		return slctstate;
	}

	public WebElement getSlctcity() {
		return slctcity;
	}

	public WebElement getTxtpincode() {
		return txtpincode;
	}

	public WebElement getBtnsaveaddress() {
		return btnsaveaddress;
	}

	public WebElement getTxtpaymenttype() {
		return txtpaymenttype;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getTxtcardno() {
		return txtcardno;
	}

	public WebElement getTxtmonth() {
		return txtmonth;
	}

	public WebElement getTxtyear() {
		return txtyear;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getBtnplaceorder() {
		return btnplaceorder;
	}

	public void mycart(String addresstype, String fstname, String lstname, String mobileno, String apartmentno,
			String address, String state, String city, String pincode, String paymnttype, String cardno,
			String crdmonth, String crdyear, String cvv) throws IOException {
		eClick(addnewaddress);
		selectOptionByValue(txtaddresstype, addresstype);
		eSendKeys(txtfstname, fstname);
		eSendKeys(txtlstname, lstname);
		eSendKeys(txtmobileno, mobileno);
		eSendKeys(txtapartmentno, apartmentno);
		eSendKeys(txtaddress, address);
		selectOptionByValue(slctstate, state);
		selectOptionByValue(slctcity, city);
		eSendKeys(txtpincode, pincode);
		eClick(btnsaveaddress);
		refreshpage();
		eClick(txtpaymenttype);
		selectOptionByValue(txtpaymenttype, paymnttype);
		eClick(cardtype);
		eSendKeys(txtcardno, cardno);
		selectOptionByValue(txtmonth, crdmonth);
		selectOptionByValue(txtyear, crdyear);
		eSendKeys(txtcvv, cvv);
		eClick(btnplaceorder);

	}

	public String messagecart() {
		String text2 = elementGetText(cartmsg);
		System.out.println(text2);
		return text2;

	}
}
