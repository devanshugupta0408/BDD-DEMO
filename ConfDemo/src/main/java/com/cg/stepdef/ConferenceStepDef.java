package com.cg.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.bean.ConferenceBean;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceStepDef {

	private WebDriver driver;
	private ConferenceBean pageBean ;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageBean = new ConferenceBean();
		PageFactory.initElements(driver, pageBean);
	}
	@Given("^User is on Conference room booking pag$")
	public void user_is_on_Conference_room_booking_pag() throws Throwable {
		driver.get("file:///D:/BDDUpdated/ConfDemo/Conference.html");
	}

	@When("^User select 'Next' link after entering Valid set of information$")
	public void user_select_Next_link_after_entering_Valid_set_of_information() throws Throwable{
	
		pageBean.setFirstName("srinivas");
		pageBean.setLastName("kolaparthi");
		pageBean.setEmail("srinivas.a.kolaparthi@capgemini.com");
		pageBean.setContactNo("9930856957");
		pageBean.setNoOfPerson("3");
		pageBean.setBuildingAndRoomNo("B building, flat 405 ,Three Jewels Society");
		pageBean.setAreaName("Tilekarnagar, Kondhwa");
		pageBean.setCity("Pune");
		pageBean.setState("Maharashtra");
		pageBean.setMemberStatus("member");
		pageBean.clickNextPageLink();
	}

	@Then("^Personal details are validated\\. message should display$")
	public void personal_details_are_validated_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}
}
