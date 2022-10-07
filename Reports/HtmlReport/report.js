$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Login In The web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch the Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_the_Adactin_Application()"
});
formatter.result({
  "duration": 10106821300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 458373100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 100758100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1359819000,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User Search The Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-search-the-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user Select the Location In The Location Dropdown List",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user Select The Hotel In The Hotel Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Roomtype In The Roomtype List",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select The Number Of Rooms In The Room Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Enter The Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Enter The Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Number Of Adults In Adult Per Room Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Number Of Children In Children Per Room Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click The Search Button And It navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Select_the_Location_In_The_Location_Dropdown_List()"
});
formatter.result({
  "duration": 432830900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Hotel_In_The_Hotel_Dropdown_List()"
});
formatter.result({
  "duration": 284481500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Roomtype_In_The_Roomtype_List()"
});
formatter.result({
  "duration": 153503600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Rooms_In_The_Room_Dropdown_List()"
});
formatter.result({
  "duration": 222007400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 338639500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 535738000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Adults_In_Adult_Per_Room_Dropdown_List()"
});
formatter.result({
  "duration": 166767300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Number_Of_Children_In_Children_Per_Room_Dropdown_List()"
});
formatter.result({
  "duration": 224103800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Search_Button_And_It_navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2052096500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User Select The Hotel In Adactin Aplication",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-select-the-hotel-in-adactin-aplication",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user Click The Select Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user Click The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Select_Radio_Button()"
});
formatter.result({
  "duration": 123132700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1052398600,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "User Book Hotel In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-book-hotel-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The Card Number In Credity Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select The Credit card Type In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Expiry Month In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Expiry Year In Dropdown List",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Cvv Number In Cvv Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click The Booknow Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 148191600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 185805100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 149835500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Card_Number_In_Credity_Card_Number_Field()"
});
formatter.result({
  "duration": 126600700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Credit_card_Type_In_Dropdown_List()"
});
formatter.result({
  "duration": 212481100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Expiry_Month_In_Dropdown_List()"
});
formatter.result({
  "duration": 159624400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Select_The_Expiry_Year_In_Dropdown_List()"
});
formatter.result({
  "duration": 217957900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Cvv_Number_In_Cvv_Number_Field()"
});
formatter.result({
  "duration": 148488800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Booknow_Button_And_It_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 5090742500,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "User Confirm Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-confirm-booking-in-adactin-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "user Click The Logout Button And It Navigates To Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Click_The_Logout_Button_And_It_Navigates_To_Home_Page()"
});
formatter.result({
  "duration": 1767289500,
  "status": "passed"
});
});