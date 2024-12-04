package org.omrbranch.pagemanager;

import org.omrbranch.pages.BookHotelPage;
import org.omrbranch.pages.BookingConfirmPage;
import org.omrbranch.pages.Loginpage;
import org.omrbranch.pages.PaymentPage;
import org.omrbranch.pages.SearchHotelPage;
import org.omrbranch.pages.SelectHotelpage;

public class PageObjectManager {

	private Loginpage loginpage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelpage selectHotelpage;
	private BookHotelPage bookHotelPage;
	private PaymentPage paymentPage;
	private BookingConfirmPage bookingConfirmPage;

	public Loginpage getLoginpage() {
		return (loginpage == null) ? loginpage = new Loginpage() : loginpage;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	public SelectHotelpage getSelectHotelpage() {
		return (selectHotelpage == null) ? selectHotelpage = new SelectHotelpage() : selectHotelpage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	public PaymentPage getPaymentPage() {
		return (paymentPage == null) ? paymentPage = new PaymentPage() : paymentPage;
	}

	public BookingConfirmPage getBookingConfrimPage() {
		return (bookingConfirmPage == null) ? bookingConfirmPage = new BookingConfirmPage() : bookingConfirmPage;
	}

}
