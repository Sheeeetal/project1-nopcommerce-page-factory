package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu mobile']/child::li[1]/a[1]")
    WebElement computerClick;
    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/child::div[1]/div[1]/h2[1]")
    WebElement deskTopClick;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement positionZToA;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computerMenu;

    @CacheLookup
    @FindBy(xpath = "//h2//a[@title='Show products in category Desktops']")
    WebElement DeskTopClick;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement positionAToZ;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyBuildyourowncomputer;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement selectFirstOptionFromProcessor;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement selectThirdOptionFromRam;
    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement clickOnRadioButtonFromHdd;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement clickOnRadioButtonFromOS;


    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement checkTwoCheckBoxes;


    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement verifyPrice;


    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement clickOnAddToCartButton;


    @CacheLookup
    @FindBy(xpath = "//div//p[contains(text(),'The product has been added to your ')]")
    WebElement verifyMessage1;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement clickOnCrossButton;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnAddToCart1;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessage2;
    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement clickOnUpdateBasket;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickOnUpdateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span//strong[contains(text(),'$2,950.00')]")
    WebElement verifyMessage3;
    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement clickOnCheckBox;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckOut;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyMessage4;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsAGuest;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement selectCounty;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;
    @CacheLookup
    @FindBy(id = "zipcode")
    WebElement zipcode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@type='button' and @onclick='Billing.save()']")
    WebElement clickContinue;

    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement clickRadioButton;
    @CacheLookup
    @FindBy(xpath = "//button[@type='button' and @onclick='ShippingMethod.save()']")
    WebElement clickOnContinuee;


    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement radioButton;

    @CacheLookup
    @FindBy(xpath = "//button[@type='button' and @onclick='PaymentMethod.save()']")
    WebElement selectCreditCard;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectMasterCard;

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectMC;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement selectExpireMonth;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement selectExpireYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@class,'payment-info-next-step-button')]")
    WebElement clickOOOnContinue;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Payment Method:')]")
    WebElement verifyMessage5;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyMessage6;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shipping Method:')]")
    WebElement verifyMessage7;
    @CacheLookup
    @FindBy(xpath = "//ul//li//span[contains(text(),'Next Day Air')]")
    WebElement verifyMessage8;
    @CacheLookup
    @FindBy(xpath = "//span//strong[contains(text(),'$2,950.00')]")
    WebElement verifyMessage9;
    @CacheLookup
    @FindBy(xpath = "//button[@type='button' and @onclick='ConfirmOrder.save()']")
    WebElement clickonConfirm;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyMessage10;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifyMessage11;
    @CacheLookup
    @FindBy(xpath = "//button[@type='button' and @onclick='setLocation(\"/\")']")
    WebElement clickOnCon;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyMessage12;


    public void clickOnComputerTab() {
        CustomListeners.test.log(Status.PASS, "click on Computer");

        clickOnElement(computerClick);
    }

    // By deskTopClick = By.xpath("//div[@class='item-grid']/child::div[1]/div[1]/h2[1]");

    public void clickOnDesktopTab() {
        CustomListeners.test.log(Status.PASS, "click on Computer");

        clickOnElement(deskTopClick);
    }

    // By positionZToA = By.id("products-orderby");

    public void clickOnPositionTab() {
        CustomListeners.test.log(Status.PASS, "click on Computer");

        clickOnElement(positionZToA);
    }

    //  By computerMenu = By.linkText("Computers");

    public void clickOnComputerMenu() {
        CustomListeners.test.log(Status.PASS, "click on ComputerMenu");

        clickOnElement(computerMenu);
    }

    //  By DeskTopClick = By.xpath("//h2//a[@title='Show products in category Desktops']");

    public void clickOnDesktopTabb() {
        CustomListeners.test.log(Status.PASS, "click on desktop");

        clickOnElement(DeskTopClick);

    }

    // By positionAToZ = By.id("products-orderby");

    public void clickOnPositionTabb() {
        CustomListeners.test.log(Status.PASS, "click on position tab");
        clickOnElement(positionAToZ);

    }

    // By addToCart = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']");

    public void clickOnAddToCart() {
        CustomListeners.test.log(Status.PASS, "click on add to cart");
        clickOnElement(addToCart);
    }

    //   By verifyBuildyourowncomputer = By.xpath("//h1[contains(text(),'Build your own computer')]");

    public String verifyMessage() {
        CustomListeners.test.log(Status.PASS, "verify");
        return getTextFromElement(verifyBuildyourowncomputer);

    }

    // By selectFirstOptionFromProcessor = By.id("product_attribute_1");

    public void selectFirstOptionFromDropDown(String option) {
        CustomListeners.test.log(Status.PASS, "options from dropdown" + option);
        selectByVisibleTextFromDropDown(selectFirstOptionFromProcessor, option);

    }

    //  By selectThirdOptionFromRam = By.id("product_attribute_2");

    public void selectThirdOptionFromDropDown(String option) {
        CustomListeners.test.log(Status.PASS, "options from dropdown" + option);
        selectByVisibleTextFromDropDown(selectThirdOptionFromRam, option);
    }

    //   By clickOnRadioButtonFromHdd = By.id("product_attribute_3_7");

    public void clickOnRadioButton() {
        CustomListeners.test.log(Status.PASS, "click on radio button");
        clickOnElement(clickOnRadioButtonFromHdd);
    }

    //   By clickOnRadioButtonFromOS = By.id("product_attribute_4_9");

    public void clickOnRadioButtonn() {
        CustomListeners.test.log(Status.PASS, "click on button");
        clickOnElement(clickOnRadioButtonFromOS);
    }

    // By checkTwoCheckBoxes = By.id("product_attribute_5_12");

    public void clickOnCheckBox() {
        CustomListeners.test.log(Status.PASS, "click on checkbox");
        clickOnElement(checkTwoCheckBoxes);
    }

    //  By verifyPrice = By.id("price-value-1");

    public String verifyMessagee() {
        CustomListeners.test.log(Status.PASS, "verify message");
        return getTextFromElement(verifyPrice);
    }

    //   By clickOnAddToCartButton = By.id("add-to-cart-button-1");

    public void setClickOnAddToCartButton() {
        CustomListeners.test.log(Status.PASS, "set click and add to cart");
        clickOnElement(clickOnAddToCartButton);
    }

    // By verifyMessage1 = By.xpath("//div//p[contains(text(),'The product has been added to your ')]");

    public String verifyMessage1() {
        CustomListeners.test.log(Status.PASS, "verify");
        return getTextFromElement(verifyMessage1);
    }

    //  By clickOnCrossButton = By.xpath("//span[@title='Close']");

    public void clickOnCrossButton() {
        CustomListeners.test.log(Status.PASS, "click on crossbutton");
        clickOnElement(clickOnCrossButton);
    }

    //   By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    //  By clickOnAddToCart1 = By.xpath("//button[contains(text(),'Go to cart')]");

    public void MouseHoverAndClickOnAddToCart() {
        CustomListeners.test.log(Status.PASS, "mousehover");
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
        clickOnElement(clickOnAddToCart1);


    }

    //   By verifyMessage2 = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyMessage2() {
        CustomListeners.test.log(Status.PASS, "verify");
        return getTextFromElement(verifyMessage2);

    }

    //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
    //  By clickOnUpdateBasket = By.xpath("//input[@class='qty-input']");

    public void updateBasket() {
        CustomListeners.test.log(Status.PASS, " update cart");
        clearAndEnterQuantity(clickOnUpdateBasket, "2");
    }

    // By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");

    public void updateOnShoppingCart() {
        CustomListeners.test.log(Status.PASS, "update shopping cart");

        clickOnElement(clickOnUpdateShoppingCart);
    }

    //	2.17 Verify the Total"$2,950.00"
    // By verifyMessage3 = By.xpath("//span//strong[contains(text(),'$2,950.00')]");

    public String verifyMessage3() {
        CustomListeners.test.log(Status.PASS, "verify");

        return getTextFromElement(verifyMessage3);

    }


    //  By clickOnCheckBox = By.id("termsofservice");

    public void checkBox() {
        CustomListeners.test.log(Status.PASS, "checkbox");
        clickOnElement(clickOnCheckBox);
    }


    //  By clickOnCheckOut = By.id("checkout");

    public void checkOut() {
        CustomListeners.test.log(Status.PASS, "checkout");
        clickOnElement(clickOnCheckOut);
    }


    //  By verifyMessage4 = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String verifyMessage4() {
        CustomListeners.test.log(Status.PASS, "verify");
        return getTextFromElement(verifyMessage4);
    }

    //	2.21 Click on “CHECKOUT AS GUEST” Tab
    // By checkOutAsAGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void checkOutAsGuesttab() {
        CustomListeners.test.log(Status.PASS, "check out guest tab");
        clickOnElement(checkOutAsAGuest);
    }

    // By firstNameField = By.id("BillingNewAddress_FirstName");

    public void enterFirstName(String name) {
        CustomListeners.test.log(Status.PASS, "firstname" + name);
        sendTextToElement(firstNameField, name);
    }
    // By lastNameField = By.id("BillingNewAddress_LastName");

    public void enterLastName(String name) {
        CustomListeners.test.log(Status.PASS, "lastname" + name);
        sendTextToElement(lastNameField, name);
    }

    // By emailField = By.id("BillingNewAddress_Email");
    public void enterEmailId(String email) {
        CustomListeners.test.log(Status.PASS, "emailField" + email);
        sendTextToElement(emailField, email);
    }

    // By selectCounty = By.id("BillingNewAddress_CountryId");
    public void selectCounty(String text) {
        CustomListeners.test.log(Status.PASS, "country" + text);
        selectByVisibleTextFromDropDown(selectCounty, text);
    }

    //   By cityField = By.id("BillingNewAddress_City");

    public void enterCityField(String text) {
        CustomListeners.test.log(Status.PASS, "city field" + text);
        sendTextToElement(cityField, text);

    }

    //  By address1 = By.id("BillingNewAddress_Address1");
    public void enterAddress1(String text) {
        CustomListeners.test.log(Status.PASS, "address" + text);
        sendTextToElement(address1, text);
    }

    //  By zipcode = By.id("BillingNewAddress_ZipPostalCode");
    public void enterzipCode(String text) {
        CustomListeners.test.log(Status.PASS, "zip code" + text);
        sendTextToElement(zipcode, text);
    }
//    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String text) {
        CustomListeners.test.log(Status.PASS, "phone number" + text);
        sendTextToElement(phoneNumber, text);
    }

    // By clickContinue = By.xpath("//button[@type='button' and @onclick='Billing.save()']");
    public void clickOnContinue() {
        CustomListeners.test.log(Status.PASS, "continue");
        clickOnElement(clickContinue);
    }

    // By clickRadioButton = By.id("shippingoption_1");

    public void clickOOnRadioButton() {
        CustomListeners.test.log(Status.PASS, "click on radio button");
        clickOnElement(clickRadioButton);

    }
    //  2.25 Click on “CONTINUE”
    //   By clickOnContinuee = By.xpath("//button[@type='button' and @onclick='ShippingMethod.save()']");

    public void clickOnContinuee() {
        CustomListeners.test.log(Status.PASS, "click on continue");
        clickOnElement(clickOnContinuee);
    }

    //  2.26 click Radio Button
    // By radioButton = By.id("paymentmethod_1");
    public void clickOnButton() {
        CustomListeners.test.log(Status.PASS, "click on button");
        clickOnElement(radioButton);
    }
    // By selectCreditCard = By.xpath("//button[@type='button' and @onclick='PaymentMethod.save()']");

    public void selectCC() {
        CustomListeners.test.log(Status.PASS, "Select credit card");
        clickOnElement(selectCreditCard);
    }

    //  2.27 Select “Master card” From Select credit card dropdown
    //   By selectMasterCard = By.id("CreditCardType");
    public void clickCardType() {
        CustomListeners.test.log(Status.PASS, "click card type");
        clickOnElement(selectMasterCard);
    }
    //   By selectMC = By.id("CreditCardType");

    public void selectMasterC(String text) {
        CustomListeners.test.log(Status.PASS, "MasterCard" + text);
        selectByVisibleTextFromDropDown(selectMC, text);
    }
    //  2.28 Fill all the details
    // By cardHolderName = By.id("CardholderName");

    public void selectCardHolderName(String text) {
        CustomListeners.test.log(Status.PASS, "cardholder" + text);
        sendTextToElement(cardHolderName, text);
    }
    //  By cardNumber = By.id("CardNumber");

    public void enterCardNumber(String text) {
        CustomListeners.test.log(Status.PASS, "emter cardnumber" + text);
        sendTextToElement(cardNumber, text);
    }
    // By expireMonth = By.id("ExpireMonth");

    public void clickOnExpireMonth() {
        CustomListeners.test.log(Status.PASS, "clicl on expire month");
        clickOnElement(expireMonth);
    }

    // By selectExpireMonth = By.id("ExpireMonth");
    public void selecttExpireMonth(String text) {
        CustomListeners.test.log(Status.PASS, "expire month" + text);
        selectByVisibleTextFromDropDown(selectExpireMonth, text);
    }
    //  By expireYear = By.id("ExpireYear");

    public void clickOnExpireYear() {
        CustomListeners.test.log(Status.PASS, "click on year");
        clickOnElement(expireYear);
    }

    //   By selectExpireYear = By.id("ExpireYear");
    public void selecttExpireYear(String text) {
        CustomListeners.test.log(Status.PASS, "select expire year" + text);
        selectByVisibleTextFromDropDown(selectExpireYear, text);
    }
    //  By cardCode = By.xpath("//input[@id='CardCode']");

    public void enterCardCode(String text) {
        CustomListeners.test.log(Status.PASS, "enter code" + text);
        sendTextToElement(cardCode, text);
    }
    //  2.29 Click on “CONTINUE”
    //  By clickOOOnContinue = By.xpath("//button[contains(@class,'payment-info-next-step-button')]");

    public void clickOnContinueee() {
        CustomListeners.test.log(Status.PASS, "click on continue");
        clickOnElement(clickOOOnContinue);
    }
    //  2.30 Verify “Payment Method” is “Credit Card”
    //  By verifyMessage5 = By.xpath("//span[contains(text(),'Payment Method:')]");

    public String verifyMessage5() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage5);
    }
    //By verifyMessage6 = By.xpath("//span[contains(text(),'Credit Card')]");

    public String verifyMessage6() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage6);
    }
    //  2.31 Verify “Shipping Method” is “Next Day Air”
    // By verifyMessage7 = By.xpath("//span[contains(text(),'Shipping Method:')]");

    public String verifyMessage7() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage7);
    }
    //  By verifyMessage8 = By.xpath("//ul//li//span[contains(text(),'Next Day Air')]");

    public String verifyMessage8() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage8);
    }
    //	2.32 Verify Total is “$2,950.00”
    //   By verifyMessage9 = By.xpath("//span//strong[contains(text(),'$2,950.00')]");

    public String verifyMessage9() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage9);
    }
    //	2.33 Click on “CONFIRM”
    // By clickonConfirm = By.xpath("//button[@type='button' and @onclick='ConfirmOrder.save()']");

    public void clickOnConfirm() {
        CustomListeners.test.log(Status.PASS, "confirm");
        clickOnElement(clickonConfirm);
    }
    //	2.34 Verify the Text “Thank You”
    //By verifyMessage10 = By.xpath("//h1[contains(text(),'Thank you')]");

    public String verifyMessage10() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage10);
    }
    //	2.35 Verify the message “Your order has been successfully processed!”
    // By verifyMessage11 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String verifyMessage11() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage11);
    }
    //	2.36 Click on “CONTINUE”

    //  By clickOnCon = By.xpath("//button[@type='button' and @onclick='setLocation(\"/\")']");

    public void clickOnConttinue() {
        CustomListeners.test.log(Status.PASS, "continue");
        clickOnElement(clickOnCon);

    }
    //  2.37 Verify the text “Welcome to our store”
    //  By verifyMessage12 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String verifyMessage12() {
        CustomListeners.test.log(Status.PASS, "verify Message");
        return getTextFromElement(verifyMessage12);
    }


}
