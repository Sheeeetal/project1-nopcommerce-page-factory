package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        topMenuPage= new TopMenuPage();
    }




    @Test(groups = { "regression"})
    public void verifyPageNavigation(){
        topMenuPage.selectMenu("Computers");
        topMenuPage.selectMenu("Electronics");
        topMenuPage.selectMenu("Apparel");
        topMenuPage.selectMenu("Digital downloads");
        topMenuPage.selectMenu("Books");
        topMenuPage.selectMenu("Jewelry");
        topMenuPage.selectMenu("Gift Cards");


    }

}
