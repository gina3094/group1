package com.interviews.step_definitions;

import com.interviews.library.Constants;
import com.interviews.utilities.BrowserUtils;
import com.interviews.utilities.ConfigurationReader;
import com.interviews.utilities.DocuportUtils;
import com.interviews.utilities.Driver;
import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;


@RunWith(JUnitParamsRunner.class)
public class loginFunctionality {

    @BeforeEach
    public void initPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"client", "supervisor", "advisor", "employee"})
    @Test
    public void loginFunctionalityPositiveScenario(String userRole) {
        DocuportUtils.login(userRole);
        BrowserUtils.waitFor(3);
        String actualHomePageUrl = Driver.getDriver().getCurrentUrl().trim().toLowerCase();
        Assertions.assertEquals(Constants.HOME_PAGE_URL, actualHomePageUrl, actualHomePageUrl + " is not the expected landing URL");
        Driver.closeDriver();
    }


}
