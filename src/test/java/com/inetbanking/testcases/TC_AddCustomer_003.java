package com.inetbanking.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.AddCustomerPage;
import com.inetbanking.pageobject.LoginPage;

public class TC_AddCustomer_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws IOException
	{
		
	LoginPage lp= new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	AddCustomerPage  addcust=new AddCustomerPage(driver);
	addcust.clickAddNewCustomer();
	addcust.custname("raju");
	addcust.custgender("male");
	String email=randomString()+"gmail.com";
	addcust.custEmail(email);
	
	boolean res=driver.getPageSource().contains("Success");
	
	if(res==true)
	{
		Assert.assertTrue(true);
	}
	else
	{
		captureScreen(driver, "addnewcustomer");
		Assert.assertTrue(false);
	}
	}
	
}
