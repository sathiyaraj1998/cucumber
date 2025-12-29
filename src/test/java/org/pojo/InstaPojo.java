package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InstaPojo extends ReusableClass {
	public InstaPojo(){
		
		  PageFactory.initElements(driver, this);
	  }	
	  
	  @FindBy(xpath="//input[@name='username']")
	    public WebElement emailTextbox;

	  @FindBy(xpath="//input[@name='password']")
	  public WebElement passwordTextBox;
	 
		  @FindBy(xpath="//button[@type='submit']")
		  public WebElement loginbutton;

		  public WebElement getEmailTextbox() {
			  return emailTextbox;
		  }

		  public void setEmailTextbox(WebElement emailTextbox) {
			  this.emailTextbox = emailTextbox;
		  }

		  public WebElement getPasswordTextBox() {
			  return passwordTextBox;
		  }

		  public void setPasswordTextBox(WebElement passwordTextBox) {
			  this.passwordTextBox = passwordTextBox;
		  }

		  public WebElement getLoginbutton() {
			  return loginbutton;
		  }

		  public void setLoginbutton(WebElement loginbutton) {
			  this.loginbutton = loginbutton;
		  }
}
