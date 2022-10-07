package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(name = "room_type")
	private WebElement room;

	@FindBy(name = "room_nos")
	private WebElement rooms;

	@FindBy(id = "datepick_in")
	private WebElement date;

	@FindBy(id = "datepick_out")
	private WebElement date1;

	@FindBy(id = "adult_room")
	private WebElement adult;

	@FindBy(id = "child_room")
	private WebElement child;

	@FindBy(name = "Submit")
	private WebElement search;

	public Search_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDate1() {
		return date1;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

}
