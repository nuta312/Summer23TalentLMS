package com.digital.pages.accountSettingsPage;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class EcommercePage extends AccountSettingsPage {

    @FindBy(xpath="//li/a[@href='https://nbu111.talentlms.com/account/ecommerce_index']")
    public WebElement enterEcommerce;
    @FindBy(xpath = "//div[@id='s2id_tl-payment-processor']")
    public WebElement selectEcommerce;

    @FindBy(xpath = "//input[@name='paypal_address']")
    public WebElement payPal;

    @FindBy(xpath = "//div[@class='controls']/a")
    public WebElement Stripe;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> allOptions;

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
    public WebElement saveEcommerce;

    @FindBy(xpath = "//div[@class='pull-right']/a[text()='E-commerce timeline']")
    public WebElement timeline;

    @FindBy(xpath = "//input[@id='tl-filter-timeline-from']")
    public WebElement openDate;
    @FindBy(xpath = "//th[@class='dow']")
    public static List<WebElement> year;
    @FindBy(xpath = "//tr/td")
    public List<WebElement> day;
    @FindBy(xpath = "//input[@id='s2id_autogen2']")
    public WebElement openSelectUser;

    @FindBy(xpath = "//input[@id='tl-filter-timeline-to']")
    public WebElement openFinishDate;

    @FindBy(xpath = "//table[@class=' table-condensed']/thead/tr/th")
    public List<WebElement> selectFinishYear;

    @FindBy(xpath = "//tr/td[@class='day  old']")
    public List<WebElement> selectFinishDay;

    @FindBy(xpath = "//div[@id='s2id_tl-filter-timeline-event']")
    public WebElement openTimeLine;

    @FindBy(xpath = "//div[@id='s2id_tl-filter-timeline-user']")
    public WebElement openUser;
    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> eventTimeLine;

    @FindBy(xpath = "//div[@id='s2id_tl-filter-timeline-user']")
    public WebElement openUserInput;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    public List<WebElement> chooseUser;

    @FindBy(xpath = "//div[@id='s2id_tl-filter-timeline-course']")
    public WebElement openCourseInput;

    @FindBy(xpath = "//select[@id='tl-filter-timeline-course']/option")
    public List<WebElement> chooseCourse;

    @FindBy(xpath = "//option[@value='131']")
    public WebElement courseOption;

    public EcommercePage openSelectUser(){
        elementActions.waitElementToBeClickable(openSelectUser);
        elementActions.scrollToTheElement(openSelectUser);
        elementActions.clickElement(openSelectUser);
        return this;
    }


    public EcommercePage selectRandomDate() {
        for (WebElement element : year) {
            if (element.getText().equals("October 2023")) {
                try {
                    elementActions.waitElementToBeClickable(element);
                    elementActions.clickToRandomElement(year);
                    break; // Exit the loop once the desired element is clicked
                } catch (TimeoutException e) {
                    // Handle the TimeoutException or take appropriate action (e.g., logging)
                    System.out.println("Timeout waiting for element to become clickable.");
                }
            }
        }
        for (WebElement element : day) {
            if (element.getText().equals("23")) {
                try {
                    elementActions.waitElementToBeClickable(element);
                    elementActions.clickToRandomElement(day);
                    break; // Exit the loop once the desired element is clicked
                } catch (TimeoutException e) {
                    // Handle the TimeoutException or take appropriate action (e.g., logging)
                    System.out.println("Timeout waiting for element to become clickable.");
                }
            }
        }
        return this;
    }

    public EcommercePage selectFinishDate() {
        for (WebElement element : selectFinishYear) {
            if (element.getText().equals("October 2023")) {
                try {
                    elementActions.waitElementToBeClickable(element);
                    elementActions.clickToRandomElement(selectFinishYear);
                    break; // Exit the loop once the desired element is clicked
                } catch (TimeoutException e) {
                    // Handle the TimeoutException or take appropriate action (e.g., logging)
                    System.out.println("Timeout waiting for element to become clickable.");
                }
            }
        }
        for (WebElement element : selectFinishDay) {
            if (element.getText().equals("28")) {
                try {
                    elementActions.waitElementToBeClickable(element);
                    elementActions.clickToRandomElement(selectFinishDay);
                    break; // Exit the loop once the desired element is clicked
                } catch (TimeoutException e) {
                    // Handle the TimeoutException or take appropriate action (e.g., logging)
                    System.out.println("Timeout waiting for element to become clickable.");
                }
            }
        }
        return this;
    }

}
