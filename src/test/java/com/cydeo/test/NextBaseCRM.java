package com.cydeo.test;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NextBaseCRM extends TestBase {
    @Test
    public void loginTest() {
        //1.Go to home page
        driver.get("https://login2.nextbasecrm.com/");
        //2.Log in with the right credentials
        //Username:helpdesk25@cybertekschool.com
        //Password:UserUser
        WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Login']"));
        userName.sendKeys("helpdesk25@cybertekschool.com");

    }
}