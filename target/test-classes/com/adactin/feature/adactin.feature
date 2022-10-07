Feature: Hotel Booking In Adactin Application

@Smoketest
Scenario: User Login In The web Application
Given user Launch the Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page 

@Smoketest
Scenario: User Search The Hotel In Adactin Application
When user Select the Location In The Location Dropdown List
And user Select The Hotel In The Hotel Dropdown List
And user Select The Roomtype In The Roomtype List
And user Select The Number Of Rooms In The Room Dropdown List
And user Enter The Check In Date In Check In Date Field
And user Enter The Check Out Date In Check Out Date Field
And user Select The Number Of Adults In Adult Per Room Dropdown List
And user Select The Number Of Children In Children Per Room Dropdown List
Then user Click The Search Button And It navigates To Select Hotel Page

@Smoketest
Scenario: User Select The Hotel In Adactin Aplication
When user Click The Select Radio Button
Then user Click The Continue Button And It Navigates To Book A Hotel Page

@Sanitytest
Scenario: User Book Hotel In Adactin Application
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Address In Billing Address Field
And user Enter The Card Number In Credity Card Number Field
And user Select The Credit card Type In Dropdown List
And user Select The Expiry Month In Dropdown List
And user Select The Expiry Year In Dropdown List
And user Enter The Cvv Number In Cvv Number Field
Then user Click The Booknow Button And It Navigates To Booking Confirmation Page

@Sanitytest
Scenario: User Confirm Booking In Adactin Application
Then user Click The Logout Button And It Navigates To Home Page

