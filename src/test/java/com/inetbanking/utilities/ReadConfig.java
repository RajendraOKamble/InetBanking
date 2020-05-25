package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	public ReadConfig() 
	
	{
		
		File src=new File("'Configurations/config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception->"+e.getMessage());
		  }
		
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;}
	
	public String getUsername()
	{
		String name=pro.getProperty("username");
		return name;}
	public String getPassword()
	{
		String pwd=pro.getProperty("password");
		return pwd;}
	
	public String getChromepath()
	{
		String cpath=pro.getProperty("chromepath");
		return cpath;}
	public String getIEpath()
	{
		String ipath=pro.getProperty("iepath");
		return ipath;}
	public String getFirefoxpath()
	{
		String fpath=pro.getProperty("firefoxpath");
		return fpath;}
	
	
	
	
	
}
