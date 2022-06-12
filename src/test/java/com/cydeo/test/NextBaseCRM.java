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
        driver.get("https://login2.nextbasecrm.com/" );

        //2.Log in with the right credentials
        //Username:helpdesk25@cybertekschool.com
        //Password:UserUser
        WebElement userName= driver.findElement(By.xpath("//input[@placeholder='Login']"));
        userName.sendKeys("helpdesk25@cybertekschool.com");

        //password added
        WebElement passWord= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passWord.sendKeys("UserUser");


        //3.Click logIn button
        WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

        //4.Find Message Tab in the middle top menu and click it
        WebElement messageTab=driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']"));
        messageTab.click();

        //5.Click send button leaving the message field empty
        WebElement sendBtn=driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendBtn.click();
        //6.verify the error message is displayed
        // Expected error message: The message title is not specified
        WebElement errorMsg=driver.findElement(By.xpath("//span[.='The message title is not specified']"));
        errorMsg.isDisplayed();
        String actualMsg= errorMsg.getText();
        String expectedMsg="The message title is not specified";
        assertEquals(actualMsg,expectedMsg,"Test failed");
    }

}



    }
}