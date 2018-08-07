package com.cg.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBean {
	
	@FindBy(how=How.NAME, name="uname")
	private WebElement uname;
	
	@FindBy(how=How.NAME, name="psw")
	private WebElement psw;
	
	@FindBy(how=How.NAME, name="submit")
	private WebElement submit;
	
	 public void LoginButton(){
	       submit.click();
}

	public String getUname() {
		return uname.getAttribute("value");
	}

	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}

	public String getPsw() {
		return psw.getAttribute("value");
	}

	public void setPsw(String psw) {
		this.psw.sendKeys(psw);
	}


	 
	 
}