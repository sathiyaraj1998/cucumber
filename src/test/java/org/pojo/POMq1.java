package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class POMq1 extends ReusableClass{
public POMq1() {
      PageFactory.initElements(driver, this);

}

@FindBy(id="email")
public WebElement emailTextbox;
@FindBy(xpath="//input[@name='pass']")
public WebElement passwordTextBox;
@FindBys({
	  @FindBy(xpath="//button[text()='Log in']"),
	  @FindBy(xpath="//button[@name='login']")
})
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
