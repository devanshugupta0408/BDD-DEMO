package com.cg.step;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.bean.LoginBean;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	 static WebDriver driver;
	 private LoginBean pageBean;

	@Before
	public  void init() {

		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		pageBean= new LoginBean();
		PageFactory.initElements(driver, pageBean);
	}

	/*@Test
	public  void gittest() {
		try {
			 need_to_log_in_on_html_page();
			 he_enters_correct_userID_and_Password();
			 display_a_success_login_message();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
	@Given("^Need to log-in on html page$")
	public void need_to_log_in_on_html_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://localhost:8800/POM/login.html");
	}
	

	@When("^he enters correct userID and Password$")
	public void he_enters_correct_userID_and_Password() throws Throwable {
		pageBean.setUname("dev");
		pageBean.setPsw("1234566");
		pageBean.LoginButton();
	}

	@Then("^display a success login message$")
	public void display_a_success_login_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

}
