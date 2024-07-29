package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public static WebDriver driver;
	
	@Given("^user Enter The Url Of The Adactin Application$")
	public void user_Enter_The_Url_Of_The_Adactin_Application() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("^user Enter The Username In The Respective Field$")
	public void user_Enter_The_Username_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ShrutheC");
	}

	@When("^user Enter The Password In The Respective Field$")
	public void user_Enter_The_Password_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Adactin@123");
	}

	@Then("^user Clicks The Loginbutton and Its Navigates To The Search Hotel Page$")
	public void user_Clicks_The_Loginbutton_and_Its_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	}

	@Given("^user Is On The Search Hotel Page$")
	public void user_Is_On_The_Search_Hotel_Page() throws Throwable {
		driver.getTitle().contains("Search Hotel");
	}

	@When("^user Selects The Location From The Dropdown$")
	public void user_Selects_The_Location_From_The_Dropdown() throws Throwable {
		WebElement singledrop = driver.findElement(By.id("location"));
		Select select = new Select(singledrop);
		select.selectByValue("London");
	}

	@When("^user Selects The Hotel From The Dropdown$")
	public void user_Selects_The_Hotel_From_The_Dropdown() throws Throwable {
		WebElement s = driver.findElement(By.id("hotels"));
		Select select1 = new Select(s);
		select1.selectByValue("Hotel Creek");
	}

	@When("^user Selects The Room Type From The Dropdown$")
	public void user_Selects_The_Room_Type_From_The_Dropdown() throws Throwable {
		WebElement a1 = driver.findElement(By.id("room_type"));
		Select select2 = new Select(a1);
		select2.selectByValue("Double");
	}

	@When("^user Selects The Number Of Rooms From The Dropdown$")
	public void user_Selects_The_Number_Of_Rooms_From_The_Dropdown() throws Throwable {
		WebElement sd = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select selects = new Select(sd);
		selects.selectByValue("2");
	}

	@When("^user Enters The Check-In Date$")
	public void user_Enters_The_Check_In_Date() throws Throwable {
		WebElement f = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		f.clear();
		f.sendKeys("12/07/2024");
	}

	@When("^user Enters The Check-Out Date$")
	public void user_Enters_The_Check_Out_Date() throws Throwable {
		WebElement f2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		f2.clear();
		f2.sendKeys("13/07/2024");
	}

	@When("^user Selects The Adults Per Room From The Dropdown$")
	public void user_Selects_The_Adults_Per_Room_From_The_Dropdown() throws Throwable {
		WebElement sd1 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select selects1 = new Select(sd1);
		selects1.selectByValue("2");
	}

	@When("^user Selects The Children Per Room From The Dropdown$")
	public void user_Selects_The_Children_Per_Room_From_The_Dropdown() throws Throwable {
		WebElement sd2 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select selects2 = new Select(sd2);
		selects2.selectByValue("2");
	}

	@Then("^user Clicks The Search Button and It Navigates To The Select Hotel Page$")
	public void user_Clicks_The_Search_Button_and_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		WebElement l = driver.findElement(By.xpath("//input[@value='Search']"));
		l.click();
	}

	@Given("^user Is On The Select Hotel Page$")
	public void user_Is_On_The_Select_Hotel_Page() throws Throwable {
		driver.getTitle().contains("Select Hotel");
	}

	@When("^user Selects The Hotel$")
	public void user_Selects_The_Hotel() throws Throwable {
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^user Clicks The Continue Button and It Navigates To The Book A Hotel Page$")
	public void user_Clicks_The_Continue_Button_and_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}

	@Given("^user Is On The Book A Hotel Page$")
	public void user_Is_On_The_Book_A_Hotel_Page() throws Throwable {
		driver.getTitle().contains("Book A Hotel");
	}

	@When("^user Enters The First Name In The Respective Field$")
	public void user_Enters_The_First_Name_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Shruthe");
	}

	@When("^user Enters The Last Name In The Respective Field$")
	public void user_Enters_The_Last_Name_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Chezhiyaan");
	}

	@When("^user Enters The Billing Address In The Respective Field$")
	public void user_Enters_The_Billing_Address_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("london");
	}

	@When("^user Enters The Credit Card Number In The Respective Field$")
	public void user_Enters_The_Credit_Card_Number_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1546124514527895");
	}

	@When("^user Selects The Credit Card Type From The Dropdown$")
	public void user_Selects_The_Credit_Card_Type_From_The_Dropdown() throws Throwable {
		WebElement sd3 = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select selects3 = new Select(sd3);
		selects3.selectByValue("MAST");
	}

	@When("^user Selects The Expiry Date From The Dropdown$")
	public void user_Selects_The_Expiry_Date_From_The_Dropdown() throws Throwable {
		WebElement sd4 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select selects4 = new Select(sd4);
		selects4.selectByValue("5");
		WebElement sd5 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select selects5 = new Select(sd5);
		selects5.selectByValue("2028");
	}

	@When("^user Enters The CW Number In The Respective Field$")
	public void user_Enters_The_CW_Number_In_The_Respective_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("342");
	}

	@Then("^user Clicks The Book Now Button and It Navigates To The Booking Confirmation Page$")
	public void user_Clicks_The_Book_Now_Button_and_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		WebElement l1 = driver.findElement(By.name("book_now"));
		l1.click();
	}

	@Given("^user Is On The Booking Confirmation Page$")
	public void user_Is_On_The_Booking_Confirmation_Page() throws Throwable {
		driver.getTitle().contains("Booking Confirmation");
	}

	@When("^user Clicks The Logout Button and It Navigates To The Logout Page$")
	public void user_Clicks_The_Logout_Button_and_It_Navigates_To_The_Logout_Page() throws Throwable {
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^user should see a logout Page$")
	public void user_should_see_a_logout_Page() throws Throwable {
		System.out.println("Logged out Successfully");
	}

}
