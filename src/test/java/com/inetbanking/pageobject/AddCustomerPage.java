package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement lnkAddNewCustomer;

	@FindBy(how=How.NAME,using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement txtCustomerName;

	@FindBy(how=How.NAME,using="rad1")
	WebElement rdGender;
	
	@FindBy(how=How.NAME,using="/html/body/div[3]/div/ul/li[2]/a")
	WebElement txtEmail;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custname(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	

	public void custgender(String rgender)
	{
		rdGender.click();
	}
	

	public void custEmail(String strEmail)
	{
txtEmail.sendKeys(strEmail);

	}
}
