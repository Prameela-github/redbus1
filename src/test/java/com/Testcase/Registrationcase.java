package com.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Excelutility.Exceldata;
import com.Pages.Loginpage;
import com.Pages.Registrationpage;

import BaseClass.Baseclass;

public class Registrationcase extends Baseclass{
@BeforeMethod
public void startUp() {
	launchApp("Chrome","http://practice.automationtesting.in/");
}
@Test
public void register() throws IOException, InterruptedException {
	Registrationpage log  = new Registrationpage(driver);
    Exceldata dat =new Exceldata();
    log.click_MyAccount();
    log.Register(dat.Email(1),dat.Password(1));
    log.click_Register();
    Thread.sleep(3000);
}
@AfterMethod

public void close() throws IOException {
	screenshot("C:\\Users\\BLTuser.BLT055\\eclipse-workspace\\Automation\\Screenshot\\Register.png");
	quit();
}
}

