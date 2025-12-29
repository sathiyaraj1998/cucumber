package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoJunean extends ReusableClass{
 public PojoJunean() {
    PageFactory.initElements(driver, this);
 }
 @FindBy(xpath="//input[@type='button']")
 private WebElement skip;
 
 
 public WebElement getSkip() {
	return skip;
}
 public void setSkip(WebElement skip) {
	this.skip = skip;
}
 
 
 @FindBy(xpath="//span[@class='user-message brand-font-primary-bold hidden-sm-down']")
 private WebElement signIn;
 
 @FindBy(xpath="(//input[@type='email'])[1]")
 private WebElement emailId;
 
 @FindBy(xpath="//input[@type='password']")
 private WebElement password;
 
 
 @FindBy(xpath="//button[@value='Login']")
 private WebElement signInButton;
 
 @FindBy(xpath="//input[@type='search']")
 private WebElement searchBox;
 
 @FindBy(xpath="(//a[@class='link text-black name-link d-block product-tile-name'])[1]")
 private WebElement shirt;
 public WebElement getSearchBox() {
	return searchBox;
}
 public void setSearchBox(WebElement searchBox) {
	this.searchBox = searchBox;
 }
 public WebElement getClickSearch() {
	return clickSearch;
 }
 public void setClickSearch(WebElement clickSearch) {
	this.clickSearch = clickSearch;
 }
 @FindBy(xpath="(//button[@type='submit'])[1]")
 private WebElement clickSearch;
 
 
 public WebElement getEmailId() {
	return emailId;
}
 public void setEmailId(WebElement emailId) {
	this.emailId = emailId;
 }
 public WebElement getPassword() {
	return password;
 }
 public void setPassword(WebElement password) {
	this.password = password;
 }

 
 public WebElement getSignInButton() {
	return signInButton;
 }
 public void setSignInButton(WebElement signInButton) {
	this.signInButton = signInButton;
 }
 public WebElement getSignIn() {
	return signIn;
 }
 public void setSignIn(WebElement signIn) {
	this.signIn = signIn;
 }
 public WebElement getCheckBox() {
	// TODO Auto-generated method stub
	return null;
 }

}
