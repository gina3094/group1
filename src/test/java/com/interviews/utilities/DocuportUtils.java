package com.interviews.utilities;

import com.interviews.pages.LoginPage;

public class DocuportUtils {
    public static void login(String userRole) {
        LoginPage loginPage = new LoginPage();
        loginPage.getUsernameInput().sendKeys(ConfigurationReader.getProperty(userRole + "Username"));
        loginPage.getPasswordInput().sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.getSubmitBtn().click();
    }

    public static void invalidLogin(String userRole, String invalidType) {
        LoginPage loginPage = new LoginPage();
        if (invalidType.equals("password")) {
            loginPage.getUsernameInput().sendKeys(ConfigurationReader.getProperty(userRole + "Username"));
            loginPage.getPasswordInput().sendKeys("invalid");
        } else if (invalidType.equals("credentials")) {
            loginPage.getUsernameInput().sendKeys("invalid");
            loginPage.getPasswordInput().sendKeys("invalid");
        } else {
            loginPage.getUsernameInput().sendKeys("invalid@google.com");
            loginPage.getPasswordInput().sendKeys(ConfigurationReader.getProperty("password"));
        }
        loginPage.getSubmitBtn().click();
    }
}
