package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.runner.RunnerClass;
import com.properties.FileReaderManager;
import com.sdp.PageObjectManager;
import Base_Class.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = RunnerClass.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().geturl();
		driver = BaseClass.get(url);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		// inputValueElement(pom.getInstanceLogin().getName(), "johndurai");
		WebElement name = pom.getInstanceLogin().getName();
		String userName = FileReaderManager.getInstance().getInstanceCR().getUserName();
		inputValueElement(name, userName);
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		// inputValueElement(pom.getInstanceLogin().getPassword(), "12345678");
		WebElement pass = pom.getInstanceLogin().getPassword();
		String password = FileReaderManager.getInstance().getInstanceCR().getPassword();
		inputValueElement(pass, password);
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceLogin().getLogin());
	}

	@When("^user Select the Location In The Location Dropdown List$")
	public void user_Select_the_Location_In_The_Location_Dropdown_List() throws Throwable {
		dropDown("selectByvalue", pom.getInstanceSearch().getLocation(), "Los Angeles");
	}

	@When("^user Select The Hotel In The Hotel Dropdown List$")
	public void user_Select_The_Hotel_In_The_Hotel_Dropdown_List() throws Throwable {
		dropDown("selectBYIndex", pom.getInstanceSearch().getHotel(), "3");
	}

	@When("^user Select The Roomtype In The Roomtype List$")
	public void user_Select_The_Roomtype_In_The_Roomtype_List() throws Throwable {
		dropDown("selectByVisibleText", pom.getInstanceSearch().getRoom(), "Deluxe");
	}

	@When("^user Select The Number Of Rooms In The Room Dropdown List$")
	public void user_Select_The_Number_Of_Rooms_In_The_Room_Dropdown_List() throws Throwable {
		dropDown("selectByValue", pom.getInstanceSearch().getRooms(), "3");
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		clearOnText(pom.getInstanceSearch().getDate());
		inputValueElement(pom.getInstanceSearch().getDate(), "09/10/2022");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		clearOnText(pom.getInstanceSearch().getDate1());
		inputValueElement(pom.getInstanceSearch().getDate1(), "14/10/2022");
	}

	@When("^user Select The Number Of Adults In Adult Per Room Dropdown List$")
	public void user_Select_The_Number_Of_Adults_In_Adult_Per_Room_Dropdown_List() throws Throwable {
		dropDown("selectByValue", pom.getInstanceSearch().getAdult(), "2");
	}

	@When("^user Select The Number Of Children In Children Per Room Dropdown List$")
	public void user_Select_The_Number_Of_Children_In_Children_Per_Room_Dropdown_List() throws Throwable {
		dropDown("selectByVisibleText", pom.getInstanceSearch().getChild(), "2 - Two");
	}

	@Then("^user Click The Search Button And It navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_navigates_To_Select_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceSearch().getSearch());
	}

	@When("^user Click The Select Radio Button$")
	public void user_Click_The_Select_Radio_Button() throws Throwable {
		clickOnElement(pom.getInstanceButton().getSelect());
	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		clickOnElement(pom.getInstanceButton().getCont());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getFname(), "johndurai");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getLname(), "raj");
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getAddress(), "12,down street,ecr,chennai,tamilnadu");
	}

	@When("^user Enter The Card Number In Credity Card Number Field$")
	public void user_Enter_The_Card_Number_In_Credity_Card_Number_Field() throws Throwable {
		//inputValueElement(pom.getInstanceBook().getCard(), "8787909065654343");
		WebElement carddetail = pom.getInstanceBook().getCard();
		String card = FileReaderManager.getInstance().getInstanceCR().getCard();
		inputValueElement(carddetail, card);
	}

	@When("^user Select The Credit card Type In Dropdown List$")
	public void user_Select_The_Credit_card_Type_In_Dropdown_List() throws Throwable {
		dropDown("selectByIndex", pom.getInstanceBook().getType(), "2");
	}

	@When("^user Select The Expiry Month In Dropdown List$")
	public void user_Select_The_Expiry_Month_In_Dropdown_List() throws Throwable {
		dropDown("selectByValue", pom.getInstanceBook().getExp(), "10");
	}

	@When("^user Select The Expiry Year In Dropdown List$")
	public void user_Select_The_Expiry_Year_In_Dropdown_List() throws Throwable {
		dropDown("selectByVisibletext", pom.getInstanceBook().getYear(), "2022");
	}

	@When("^user Enter The Cvv Number In Cvv Number Field$")
	public void user_Enter_The_Cvv_Number_In_Cvv_Number_Field() throws Throwable {
		inputValueElement(pom.getInstanceBook().getCvv(), "457");
	}

	@Then("^user Click The Booknow Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Booknow_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		clickOnElement(pom.getInstanceBook().getBook());
		Thread.sleep(5000);
	}

	@Then("^user Click The Logout Button And It Navigates To Home Page$")
	public void user_Click_The_Logout_Button_And_It_Navigates_To_Home_Page() throws Throwable {
		clickOnElement(pom.geInstancetLogout().getLogout());
	}
}
