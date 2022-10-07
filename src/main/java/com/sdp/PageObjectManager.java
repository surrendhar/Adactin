package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Booking;
import com.pom.LogOut;
import com.pom.Log_in;
import com.pom.RadioButton;
import com.pom.Search_hotel;

public class PageObjectManager {

	public static WebDriver driver;
	
	private Log_in login;
	private Search_hotel search;
	private RadioButton button;
	private Booking book;
	private LogOut logout;
	
	public PageObjectManager(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}
	public Log_in getInstanceLogin() {
		login = new Log_in(driver);
		return login;
	}
	public Search_hotel getInstanceSearch() {
		search = new Search_hotel(driver);
		return search;
	}
	public RadioButton getInstanceButton() {
		button = new RadioButton(driver);
		return button;
	}
	public Booking getInstanceBook() {
		book= new Booking(driver);
		return book;
	}
	public LogOut geInstancetLogout() {
		logout = new LogOut(driver);
		return logout;
	}
	
	
	
	
	
}
