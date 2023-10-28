package com.digital.pages.accountSettingsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class EcommercePage extends AccountSettingsPage {

    @FindBy(xpath="//li/a[@href='https://nbu111.talentlms.com/account/ecommerce_index']")
    public WebElement enterEcommerce;
    @FindBy(xpath = "//div[@id='s2id_tl-payment-processor']")
    public WebElement selectEcommerce;

    @FindBy(linkText = "Select your e-commerce processor")
    public WebElement selectFirstOption;

    @FindBy(xpath = "//option[text()='PayPal']")
    public WebElement selectSecondOption;

    @FindBy(xpath = "//option[text()='Stripe']")
    public WebElement selectThirdOption;

    @FindBy(xpath = "//ul[@class='select2-results']/li")
    public static List<WebElement> allOptions;

    @FindBy(linkText = "Subscription")
    public WebElement showSubscription;

    @FindBy(xpath = "//div/a[@id='show-discount']")
    public WebElement showDiscount;

    @FindBy(xpath = "//input[@id='global_discount']")
    public WebElement checkedDiscount;

    @FindBy(xpath = "//input[@id='global_discount_percentage']")
    public WebElement discountPercentage;

    @FindBy(xpath = "//input[@id='tl-ecommerce-subscription']")
    public WebElement subscriptionChecked;

    @FindBy(xpath = "//input[@id='tl-ecommerce-subscription-price']")
    public WebElement subscriptionPrice;

    @FindBy(xpath = "//a[@id='show-invoices']")
    public WebElement showInvoices;

    @FindBy(xpath = "//input[@id='issue_invoices']")
    public WebElement checkboxInvoices;

    @FindBy(xpath = "//textarea[@id='invoices_message']")
    public WebElement invoicesMessage;

    @FindBy(xpath = "//a[@id='show-coupons']")
    public WebElement showCoupons;

    @FindBy(xpath = "//a[@id='add-coupon-button']")
    public WebElement addCouponButton;

    @FindBy(linkText = "Credits")
    public WebElement showCredits;

    @FindBy(xpath = "//input[@id='tl-ecommerce-credits']")
    public WebElement creditsCheckbox;

    @FindBy(xpath = "//input[@name='credits_to_add']")
    public WebElement creditsAdd;

    @FindBy(xpath = "//div[@id='s2id_tl-credits-operation']")
    public WebElement haveCredits;

    @FindBy(xpath = "//label[@class='radio inline']/input[@value='1']")
    public WebElement radioBtnAllUsers;

    @FindBy(xpath = "//label[@class='radio inline']/input[@value='4']")
    public WebElement radioBtnSpecificUsers;

    @FindBy(xpath = "//input[@id='s2id_autogen4']")
    public WebElement specificUser;

    @FindBy(xpath = "//input[@name='submit_ecommerce']")
    public WebElement submitEcommerce;

    @FindBy(xpath = "//div[@class='pull-right']/a[@href='https://nbu111.talentlms.com/reports/timeline/mode:ecommerce']")
    public WebElement timeline;

    @FindBy(xpath = "//input[@id='tl-filter-timeline-from']")
    public WebElement openDate;
    @FindBy(xpath = "//th[@class='dow']")
    public static List<WebElement> year;

    @FindBy(xpath = "//tr/td")
    public List<WebElement> day;
    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    public WebElement openSelectUser;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> usersTimeLine;


    public EcommercePage enterEcommerce(){
        elementActions.clickElement(enterEcommerce);
        return this;
    }
    public EcommercePage openOptionsEcommerce(){
        elementActions.clickElement(selectEcommerce);
        return this;
    }

    public EcommercePage selectFirst(){
//        elementActions.waitElementToBeClickable(selectFirstOption);
        elementActions.clickElement(selectFirstOption);
        return this;
    }

//    public EcommercePage selectRandom(){
//        Select selectOption = new Select(options);
//        elementActions.clickToRandomElement(selectOption.getAllSelectedOptions());
//        return this;
//    }

    public EcommercePage showSubscription(){
        elementActions.clickElement(showSubscription);
        return this;
    }

    public EcommercePage showDiscount(){
        elementActions.waitElementToBeClickable(showDiscount);
        elementActions.clickElement(showDiscount);
        return this;
    }

    public EcommercePage checkedDiscount(){
        elementActions.clickElement(checkedDiscount);
        return this;
    }

    public EcommercePage discountPercentage(){
        elementActions.writeText(discountPercentage, "23");
        return this;
    }

    public EcommercePage subscriptionChecked(){
        elementActions.waitElementToBeClickable(subscriptionChecked);
        elementActions.clickElement(subscriptionChecked);
        return this;
    }

    public EcommercePage subscriptionPrice(){
        elementActions.waitElementToBeVisible(subscriptionPrice);
        elementActions.writeText(subscriptionPrice, "5000$");
        return this;
    }

    public EcommercePage showInvoices(){
        elementActions.clickElement(showInvoices);
        return this;
    }

    public EcommercePage checkboxInvoices(){
        elementActions.waitElementToBeClickable(checkboxInvoices);
        elementActions.clickElement(checkboxInvoices);
        return this;
    }

    public EcommercePage invoicesSendMessage() {
        elementActions.waitElementToBeClickable(invoicesMessage);
        elementActions.writeText(invoicesMessage, "Hello my name is Kanzada");
        return this;
    }

    public EcommercePage showCoupons(){
        elementActions.clickElement(showInvoices);
        return this;
    }

    public EcommercePage addCouponButton(){
        elementActions.waitElementToBeClickable(addCouponButton);
        elementActions.scrollToTheElement(addCouponButton);
        elementActions.clickElement(addCouponButton);
        return this;
    }

    public EcommercePage showCredits() {
        elementActions.clickElement(showCredits);
        return this;
    }

    public EcommercePage creditsChecked(){
        elementActions.clickElement(creditsCheckbox);
        return this;
    }

    public EcommercePage haveNotCredits(){
        elementActions.clickElement(haveCredits);
        return this;
    }

    public EcommercePage creditsAdd(){
        elementActions.writeText(creditsAdd, "2");
        return this;
    }

    public EcommercePage radioBtnAllUsers(){
        elementActions.clickElement(radioBtnAllUsers);
        return this;
    }

    public EcommercePage radioBtnSpecificUsers(){
        elementActions.clickElement(radioBtnSpecificUsers);
        return this;
    }

    public EcommercePage specificUser(){
        elementActions.writeText(specificUser, "For specific user");
        return this;
    }

    public EcommercePage submitEcommerce(){
        elementActions.waitElementToBeClickable(submitEcommerce);
        elementActions.clickElement(submitEcommerce);
        return this;
    }

    public EcommercePage timeLine(){
        elementActions.waitElementToBeClickable(timeline);
        elementActions.clickElement(timeline);
        return this;
    }

//    public EcommercePage openDate(){
//
//        elementActions.clickElement(openDate);
//        return this;
//    }

    public EcommercePage selectRandomDate(){
        elementActions.waitElementToBeClickable(openDate);
        elementActions.clickElement(openDate);
        elementActions.clickToRandomElement(year);
        elementActions.clickToRandomElement(day);
        return this;
    }

    public EcommercePage openSelectUser(){
        elementActions.waitElementToBeClickable(openSelectUser);
        elementActions.scrollToTheElement(openSelectUser);
        elementActions.clickElement(openSelectUser);
        return this;
    }
}
