package com.inetbanking.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;



public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public void LoginTest() throws IOException
	{
		
		logger.info("URL is oepned");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username entered");
		lp.setPassword(password);
		logger.info("passwod entered");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("login test failed");
			captureScreen(driver,"LoginTest");
		}
	}
}
