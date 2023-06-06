package com.interviews.utilities;

import com.interviews.pages.LoginPage;

public class DocuportUtils {
    public static void login(String userRole) {
        LoginPage loginPage = new LoginPage();
        loginPage.getUsernameInput().sendKeys(ConfigurationReader.getProperty(userRole+"Username"));
        loginPage.getPasswordInput().sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.getSubmitBtn().click();
    }
}
