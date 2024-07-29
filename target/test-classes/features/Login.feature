Feature: To Test The Adactin Hotel Booking Application
Scenario: Checks The Adactin Login Page 
Given user Enter The Url Of The Adactin Application
When user Enter The Username In The Respective Field
And user Enter The Password In The Respective Field 
Then user Clicks The Loginbutton and Its Navigates To The Search Hotel Page

Scenario: Check The Search Hotel Page
Given user Is On The Search Hotel Page 
When user Selects The Location From The Dropdown 
And user Selects The Hotel From The Dropdown 
And user Selects The Room Type From The Dropdown 
And user Selects The Number Of Rooms From The Dropdown 
And user Enters The Check-In Date 
And user Enters The Check-Out Date 
And user Selects The Adults Per Room From The Dropdown 
And user Selects The Children Per Room From The Dropdown
Then user Clicks The Search Button and It Navigates To The Select Hotel Page

Scenario: Check The Select Hotel Page
Given user Is On The Select Hotel Page
When user Selects The Hotel
Then user Clicks The Continue Button and It Navigates To The Book A Hotel Page

Scenario: Check The Book A Hotel Page
Given user Is On The Book A Hotel Page
When user Enters The First Name In The Respective Field
And user Enters The Last Name In The Respective Field
And user Enters The Billing Address In The Respective Field
And user Enters The Credit Card Number In The Respective Field
And user Selects The Credit Card Type From The Dropdown
And user Selects The Expiry Date From The Dropdown
And user Enters The CW Number In The Respective Field
Then user Clicks The Book Now Button and It Navigates To The Booking Confirmation Page

Scenario: Check The Booking Confirmation Page
Given user Is On The Booking Confirmation Page
When user Clicks The Logout Button and It Navigates To The Logout Page
Then user should see a logout Page