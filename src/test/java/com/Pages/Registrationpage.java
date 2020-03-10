package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registrationpage {
WebDriver driver;

By MyAccount=By.xpath("//*[@id=\"menu-item-50\"]/a");
By Email=By.id("reg_email");
By Password=By.id("reg_password");
By Register=By.name("register");

public Registrationpage(WebDriver driver) {
	this.driver=driver;
}
public void click_MyAccount() {
	driver.findElement(MyAccount).click();
}
public void Register(String email,String pass) {
	driver.findElement(Email).sendKeys(email);
	driver.findElement(Password).sendKeys(pass);
}	
public void click_Register() {
	// TODO Auto-generated method stub
	driver.findElement(Register).click();
	}
}

   
